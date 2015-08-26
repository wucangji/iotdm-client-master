package org.opendaylight.iotdm.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.opendaylight.iotdm.client.api.ClientApi;
import org.opendaylight.iotdm.primitive.RequestPrimitive;
import org.opendaylight.iotdm.primitive.ResponsePrimitive;

/**
 * Created by wenxshi on 5/6/15.
 */
public class Exchange {

    private RequestPrimitive requestPrimitive;
    private ResponsePrimitive responsePrimitive;
    private String host;
    private String port;
    private String timeout;
    private ClientApi client;

    public RequestPrimitive getRequestPrimitive() {
        return requestPrimitive;
    }

    public void setRequestPrimitive(RequestPrimitive requestPrimitive) {
        this.requestPrimitive = requestPrimitive;
    }

    public ResponsePrimitive getResponsePrimitive() {
        return responsePrimitive;
    }

    public void setResponsePrimitive(ResponsePrimitive responsePrimitive) {
        this.responsePrimitive = responsePrimitive;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public ClientApi getClient() {
        return client;
    }

    public void setClient(ClientApi client) {
        this.client = client;
    }


    public String toString() {
        JsonObject root=new JsonObject();

        if(host!=null)
            root.addProperty("host",host);
        if(port!=null)
            root.addProperty("port",port);
        if(timeout!=null)
            root.addProperty("timeout",timeout);
        if(requestPrimitive!=null)
            root.add("requestPrimitive", new JsonParser().parse(new Gson().toJson(requestPrimitive)));
        if(client!=null)
            root.add("client",new JsonParser().parse(client.toString()));
        if(responsePrimitive!=null)
            root.add("responsePrimitive", new JsonParser().parse(new Gson().toJson(responsePrimitive)));
        return new GsonBuilder().setPrettyPrinting().create().toJson(root);
    }
}
