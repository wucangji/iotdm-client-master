package org.opendaylight.iotdm.client.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.sun.jersey.api.json.JSONJAXBContext;
import com.sun.jersey.api.json.JSONMarshaller;
import org.apache.http.client.utils.URIBuilder;
import org.opendaylight.iotdm.constant.OneM2M;
import org.opendaylight.iotdm.primitive.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.io.StringWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class Prepare {

    public static URI uri(RequestPrimitive requestPrimitive, String host, String port, String schema) {


        URIBuilder ub;
        try {
            ub = new URIBuilder(requestPrimitive.getTo());
        } catch (Exception e) {
            ub = new URIBuilder();
            ub.setPath("");
        }
        if (!ub.getPath().startsWith("/"))
            ub.setPath("/" + ub.getPath());

        if (ub.getHost() == null)
            ub.setHost(host);

        if (ub.getPort() < 0)
            ub.setPort(Integer.valueOf(port));

        ub.setScheme(schema);

        if (requestPrimitive.getResponseType() != null && requestPrimitive.getResponseType().getRtv() != null)
            ub.addParameter(OneM2M.Name.Primitive.RESPONSE_TYPE.toString(), requestPrimitive.getResponseType().getRtv().toString());

//        if (requestPrimitive.getResourceType() != null)
//            ub.addParameter(OneM2M.Name.Primitive.RESOURCE_TYPE.toString(), requestPrimitive.getResourceType().toString());

        if (requestPrimitive.getResultPersistence() != null)
            ub.addParameter(OneM2M.Name.Primitive.RESULT_PERSISTENCE.toString(), requestPrimitive.getResultPersistence().toString());

        if (requestPrimitive.getDiscoveryResultType() != null)
            ub.addParameter(OneM2M.Name.Primitive.DELIVERY_AGGREGATION.toString(), requestPrimitive.getDiscoveryResultType().toString());

        if (requestPrimitive.getResultContent() != null)
            ub.addParameter(OneM2M.Name.Primitive.RESULT_CONTENT.toString(), requestPrimitive.getResultContent().toString());

        if (requestPrimitive.getFilterCriteria() != null) {
            FilterCriteria fc = requestPrimitive.getFilterCriteria();
            if (fc.getCrb() != null)
                ub.addParameter(OneM2M.Name.Primitive.CREATED_BEFORE.toString(), fc.getCrb());

            if (fc.getCra() != null)
                ub.addParameter(OneM2M.Name.Primitive.CREATED_AFTER.toString(), fc.getCra());

            if (fc.getMs() != null)
                ub.addParameter(OneM2M.Name.Primitive.MODIFIED_SINCE.toString(), fc.getMs());

            if (fc.getUs() != null)
                ub.addParameter(OneM2M.Name.Primitive.UNMODIFIED_SINCE.toString(), fc.getUs());

            if (fc.getSts() != null)
                ub.addParameter(OneM2M.Name.Primitive.STATE_TAG_SMALLER.toString(), fc.getSts().toString());

            if (fc.getStb() != null)
                ub.addParameter(OneM2M.Name.Primitive.STATE_TAG_BIGGER.toString(), fc.getStb().toString());


            if (fc.getExb() != null)
                ub.addParameter(OneM2M.Name.Primitive.EXPIRE_BEFORE.toString(), fc.getExb());

            if (fc.getExa() != null)
                ub.addParameter(OneM2M.Name.Primitive.EXPIRE_AFTER.toString(), fc.getExa());

            if (fc.getLbl() != null && !fc.getLbl().isEmpty()) {
                for (String str : fc.getLbl()) {
                    ub.addParameter(OneM2M.Name.Primitive.LABELS.toString(), str);
                }
            }

            if (fc.getTy() != null)
                ub.addParameter(OneM2M.Name.Primitive.FILTER_CRITERIA_RESOURCE_TYPE.toString(), fc.getTy().toString());

            if (fc.getSza() != null)
                ub.addParameter(OneM2M.Name.Primitive.SIZE_ABOVE.toString(), fc.getSza().toString());

            if (fc.getSzb() != null)
                ub.addParameter(OneM2M.Name.Primitive.SIZE_BELOW.toString(), fc.getSzb().toString());

            if (fc.getCty() != null && !fc.getCty().isEmpty()) {
                for (String str : fc.getCty()) {
                    ub.addParameter(OneM2M.Name.Primitive.CONTENT_TYPE.toString(), str);
                }
            }

            if (fc.getAtr() != null && !fc.getAtr().isEmpty()) {
                for (Attribute attribute : fc.getAtr()) {
                    String str = attribute.getNm() + ":" + attribute.getNm();
                    ub.addParameter(OneM2M.Name.Primitive.ATTRIBUTE.toString(), str);
                }
            }

            if (fc.getFu() != null)
                ub.addParameter(OneM2M.Name.Primitive.FILTER_USAGE.toString(), fc.getFu().toString());

            if (fc.getLim() != null)
                ub.addParameter(OneM2M.Name.Primitive.LIMIT.toString(), fc.getLim().toString());
        }
        if (requestPrimitive.getDiscoveryResultType() != null)
            ub.addParameter(OneM2M.Name.Primitive.DISCOVERY_RESULT_TYPE.toString(), requestPrimitive.getDiscoveryResultType().toString());

        try {
            return ub.build();
        } catch (URISyntaxException e) {
            return null;
        }
    }


//    public static String payload(RequestPrimitive requestPrimitive) {
//
//        try {
//            JAXBElement element=new JAXBElement(new QName(requestPrimitive.getPrimitiveContent().getClass().getSimpleName()),requestPrimitive.getPrimitiveContent().getClass(),requestPrimitive.getPrimitiveContent());
//            JSONJAXBContext context=new JSONJAXBContext(requestPrimitive.getPrimitiveContent().getClass());
//            JSONMarshaller marshaller=context.createJSONMarshaller();
//
//            StringWriter sw=new StringWriter();
//            marshaller.marshallToJSON(element,sw);
//            for(Map.Entry<String,JsonElement> entry:new JsonParser().parse(sw.toString()).getAsJsonObject().entrySet()){
//                //return Json.toShortNameJson(entry.getValue().toString());
//                return entry.getValue().toString();
//            }
//        } catch (JAXBException e) {
//            e.printStackTrace();
//            return null;
//        }
//        return null;
//    }

    public static void contentOfResponsePrimitive(String payload,ResponsePrimitive responsePrimitive){
        System.out.println("reponsepayload: " + payload);
        responsePrimitive.setPrimitiveContent(new PrimitiveContent());
        //responsePrimitive.getPrimitiveContent().getAny().add(new JsonParser().parse(Json.tofullNameJson(payload.trim())));
        responsePrimitive.getPrimitiveContent().getAny().add(new JsonParser().parse(payload.trim()));

    }
}
