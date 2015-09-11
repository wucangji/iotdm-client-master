package org.opendaylight.iotdm.client.impl;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.eclipse.jetty.client.ContentExchange;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.http.HttpFields;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.opendaylight.iotdm.client.Exchange;
import org.opendaylight.iotdm.client.api.ClientApi;
import org.opendaylight.iotdm.client.api.RestconfApi;
import org.opendaylight.iotdm.client.util.Prepare;
import org.opendaylight.iotdm.constant.OneM2M;
import org.opendaylight.iotdm.primitive.RequestPrimitive;
import org.opendaylight.iotdm.primitive.ResponsePrimitive;
import org.opendaylight.iotdm.primitive.ResponseTypeInfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

/**
 * Created by wenxshi on 3/30/15.
 */
public class Http implements ClientApi,RestconfApi {

    public static final int PORT = 8989;
    public static final String SCHEMA = "http";
    public static final String CREATE_IN_HTTP = "post";
    public static final String RETRIEVE_IN_HTTP = "get";
    public static final String UPDATE_IN_HTTP = "put";
    public static final String DELETE_IN_HTTP = "delete";
    public static final String NOTIFY_IN_HTTP = "post";
    public static String CONTENT_TYPE = "application/vnd.onem2m-res+json";


    private HttpClient httpClient;
    private Server httpServer;

    private String requestUrl;
    private HttpFields requestHeader;
    private String requestPayload;


    private HttpFields responseHeader;
    private String responsePayload;


    public Http() {
        httpServer = new Server(PORT);
        httpClient = new HttpClient();
        httpServer.setHandler(new NotificationHandler());
        CONTENT_TYPE = "application/vnd.onem2m-res+json";
    }

    public void start() {
        try {
            httpClient.start();
            httpServer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        try {
            httpClient.stop();
            httpServer.stop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void send(Exchange iotdmExchange) {
        iotdmExchange.setClient(this);

        ContentExchange exchange = new ContentExchange(true);
        prepareHttpRequest(exchange,iotdmExchange);

        try {
            httpClient.send(exchange);
            exchange.waitForDone();
        } catch (Exception e) {
        }
        prepareResponsePrimitive(exchange, iotdmExchange);
    }

    public void restConf(String url,String payload,String username,String password){
        ContentExchange exchange=new ContentExchange(true);
        exchange.setMethod(CREATE_IN_HTTP);
        exchange.setRequestContentType(CONTENT_TYPE);
        exchange.setURL(url);
        if (payload != null && !payload.equals(""))
            exchange.setRequestContentSource(new ByteArrayInputStream(payload.getBytes()));
        String authString= username+":"+password;
        exchange.addRequestHeader("Authorization", "Basic " + new String(Base64.encodeBase64(authString.getBytes())));
        try {
            httpClient.send(exchange);
            exchange.waitForDone();
            System.out.println(exchange.getResponseContent());
        } catch (Exception e) {
        }
    }

    private void prepareHttpRequest(ContentExchange exchange, Exchange iotdmExchange) {

        RequestPrimitive requestPrimitive=iotdmExchange.getRequestPrimitive();
        requestUrl = Prepare.uri(iotdmExchange.getRequestPrimitive(), iotdmExchange.getHost(), iotdmExchange.getPort(), SCHEMA).toString();

        if (requestPrimitive.getOperation() == BigInteger.valueOf(1) || requestPrimitive.getOperation() == BigInteger.valueOf(3) ) {
            // create and update contains the payload
            requestPayload =Prepare.payload(iotdmExchange.getRequestPrimitive());
        }

        exchange.setURL(requestUrl);
        exchange.setRequestContentType(CONTENT_TYPE);

        if (requestPayload != null && !requestPayload.equals(""))
            exchange.setRequestContentSource(new ByteArrayInputStream(requestPayload.getBytes()));

        prepareHeader(requestPrimitive, exchange);

        requestHeader =exchange.getRequestFields();

        switch (OneM2M.Operation.getEnum(requestPrimitive.getOperation())) {
            case CREATE:
                exchange.setMethod(CREATE_IN_HTTP);
                break;
            case RETRIEVE:
                exchange.setMethod(RETRIEVE_IN_HTTP);
                exchange.setRequestContentSource(null);
                break;
            case UPDATE:
                exchange.setMethod(UPDATE_IN_HTTP);
                break;
            case DELETE:
                exchange.setMethod(DELETE_IN_HTTP);
                exchange.setRequestContentSource(null);
                break;
            case NOTIFY:
                exchange.setMethod(NOTIFY_IN_HTTP);
        }

    }

    private void  prepareResponsePrimitive(ContentExchange exchange,Exchange iotdmExchange){
        ResponsePrimitive responsePrimitive=new ResponsePrimitive();
        iotdmExchange.setResponsePrimitive(responsePrimitive);

        responseHeader = exchange.getResponseFields();

        if (responseHeader != null) {
            for (String key : responseHeader.getFieldNamesCollection()) {
                switch (key) {
                    case OneM2M.Http.Header.X_M2M_RSC:
                        responsePrimitive.setResponseStatusCode(BigInteger.valueOf(responseHeader.getLongField(key)));
                        break;
                    case OneM2M.Http.Header.X_M2M_RI:
                        responsePrimitive.setRequestIdentifier(responseHeader.getStringField(key));
                        break;
                    case OneM2M.Http.Header.X_M2M_ORIGIN:
                        responsePrimitive.setFrom(responseHeader.getStringField(key));
                        break;
                    case OneM2M.Http.Header.X_M2M_OT:
                        responsePrimitive.setOriginatingTimestamp(responseHeader.getStringField(key));
                        break;
                    case OneM2M.Http.Header.X_M2M_RST:
                        responsePrimitive.setResultExpirationTimestamp(responseHeader.getStringField(key));
                        break;
                    case OneM2M.Http.Header.X_M2M_EC:
                        responsePrimitive.setEventCategory(responseHeader.getStringField(key));
                }
            }
        }

        try{
            responsePayload=exchange.getResponseContent();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Prepare.contentOfResponsePrimitive(responsePayload,responsePrimitive);
    }

    public void setContentType(BigInteger contentType) {
        CONTENT_TYPE = "application/vnd.onem2m-res+json" + ";ty=" + contentType.toString();

    }

    public void cleanContentType() {
        CONTENT_TYPE = "application/vnd.onem2m-res+json";
    }

    private void prepareHeader(RequestPrimitive requestPrimitive, ContentExchange exchange) {
        if (requestPrimitive.getFrom() != null)
            exchange.addRequestHeader(OneM2M.Http.Header.X_M2M_ORIGIN, requestPrimitive.getFrom());

//        if (requestPrimitive.getOperation() == OneM2M.Operation.CREATE.value()) {
//            // modify the header
//            //System.out.println(CONTENT_TYPE + " happens here");
//            CONTENT_TYPE = CONTENT_TYPE + ";ty=" + requestPrimitive.getResourceType().toString();
//            System.out.println(CONTENT_TYPE + " happens here");
//        }

        if (requestPrimitive.getRequestIdentifier() != null)
            exchange.addRequestHeader(OneM2M.Http.Header.X_M2M_RI, requestPrimitive.getRequestIdentifier());


        if (requestPrimitive.getName() != null)
            exchange.addRequestHeader(OneM2M.Http.Header.X_M2M_NM, requestPrimitive.getName());


        if (requestPrimitive.getGroupRequestIdentifier() != null)
            exchange.addRequestHeader(OneM2M.Http.Header.X_M2M_GID, requestPrimitive.getGroupRequestIdentifier());


        if (requestPrimitive.getResponseType() != null) {
            ResponseTypeInfo rti = requestPrimitive.getResponseType();

            if (!rti.getNotificationURI().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String ss : rti.getNotificationURI()) {
                    sb.append("&");
                    sb.append(ss);
                }
                exchange.addRequestHeader(OneM2M.Http.Header.X_M2M_RTU, sb.substring("&".length()));
            }
        }

        if (requestPrimitive.getOriginatingTimestamp() != null)
            exchange.addRequestHeader(OneM2M.Http.Header.X_M2M_OT, requestPrimitive.getOriginatingTimestamp());


        if (requestPrimitive.getResultExpirationTimestamp() != null)
            exchange.addRequestHeader(OneM2M.Http.Header.X_M2M_RST, requestPrimitive.getResultExpirationTimestamp());


        if (requestPrimitive.getRequestExpirationTimestamp() != null)
            exchange.addRequestHeader(OneM2M.Http.Header.X_M2M_RET, requestPrimitive.getRequestExpirationTimestamp());


        if (requestPrimitive.getOperationExecutionTime() != null)
            exchange.addRequestHeader(OneM2M.Http.Header.X_M2M_OET, requestPrimitive.getOperationExecutionTime());


        if (requestPrimitive.getEventCategory() != null)
            exchange.addRequestHeader(OneM2M.Http.Header.X_M2M_EC, requestPrimitive.getEventCategory());
    }

    public String toString(){
        JsonObject root=new JsonObject();

        if(requestUrl!=null)
            root.addProperty("requestUrl",requestUrl);
        if(requestHeader!=null&&requestHeader.getFieldNamesCollection().size()>0){
            JsonObject object=new JsonObject();
            for(String name:requestHeader.getFieldNamesCollection())
                object.addProperty(name,requestHeader.getStringField(name));
            root.add("requestHeader",object);
        }
        if(requestPayload!=null){
            root.add("requestPayload",new JsonParser().parse(requestPayload));
        }

        if(responseHeader!=null&&responseHeader.getFieldNamesCollection().size()>0){
            JsonObject object=new JsonObject();
            for(String name:responseHeader.getFieldNamesCollection())
                object.addProperty(name,responseHeader.getStringField(name));
            root.add("responseHeader",object);
        }
        if(responsePayload!=null){
            root.add("responsePayload",new JsonParser().parse(responsePayload));
        }
        return new GsonBuilder().setPrettyPrinting().create().toJson(root);
    }


    public class NotificationHandler extends AbstractHandler {
        public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse
                response) throws IOException, ServletException {
            String payload = IOUtils.toString(baseRequest.getInputStream());
            System.out.println("server notification:");
        }
    }
}
