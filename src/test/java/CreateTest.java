import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.BeforeClass;
import org.junit.Test;
import org.opendaylight.iotdm.client.Exchange;
import org.opendaylight.iotdm.client.api.RestconfApi;
import org.opendaylight.iotdm.client.impl.Http;
import org.opendaylight.iotdm.constant.OneM2M;
import org.opendaylight.iotdm.primitive.*;

import java.awt.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * Created by wenxshi on 6/2/15.
 */
public class CreateTest {


    @BeforeClass
    public static void provisionTree(){
        Http http=new Http();
        http.start();
        http.restConf(
                RestconfApi.URL,
                RestconfApi.PAYLOAD,
                RestconfApi.USERNAME,
                RestconfApi.PASSWORD
        );
        http.stop();
    }
    @Test
    public void createAE(){
        //AE Resource to be created

        Ae ae = new Ae();
        ae.setApn("testName");
        ae.setApi("appID");
        ae.setOr("http://ontology/ref");
        ae.setRr(true);

        ObjectMapper mapper = new ObjectMapper();
        String JsonString = "";
        try {
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
            JsonString = mapper.writeValueAsString(ae);

        }catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Request carrying AE to be created.
        //String aepayload = "{\"m2m:ae\":{ \"api\":\"testAppId\", \"apn\":\"testAppName\", \"or\":\"http://ontology/ref\",\"rr\":true}}";
        String aepayload = "{\"m2m:ae\":" + JsonString + "}";
        System.out.println("AE Json String: " + aepayload);
        RequestPrimitive requestPrimitive=new RequestPrimitive();
        requestPrimitive.setFrom("Test_AE_ID");
        //Set Destination from root of Resource for creation
        requestPrimitive.setTo("InCSE1");
        //Resource Name of resource to be created
        requestPrimitive.setName("TestAE");
        //Set OneM2m Operation
        requestPrimitive.setOperation(OneM2M.Operation.CREATE.value());
        requestPrimitive.setRequestIdentifier("12345");
        //Set ResourceType to be created
        requestPrimitive.setResourceType(OneM2M.ResourceType.AE.value());
//        requestPrimitive.setPrimitiveContent(new PrimitiveContent());
//        //Request carry resource content
//        requestPrimitive.getPrimitiveContent().getAny().add(aepayload);

        requestPrimitive.setStringpayload(aepayload);
        //Exchange carry the content of request and destination of request
        Exchange exchange=new Exchange();
        exchange.setHost("localhost");
        exchange.setPort("8282");
        exchange.setRequestPrimitive(requestPrimitive);

        //Initialization of Http client responsible for transmission.
        Http http=new Http();
        http.start();
        http.setContentType(OneM2M.ResourceType.AE.value());
        http.send(exchange);
        http.stop();

        System.out.println(exchange.toString());
    }

    @Test
    public void update(){
        //AE Resource to be updated

        String updateAEpayload = "{\"m2m:ae\":{\"or\":\"rsdfd\"\n" + "}}";
        //Request carrying AE to be updated.
        RequestPrimitive requestPrimitive=new RequestPrimitive();
        requestPrimitive.setFrom("local");
        //Set path of resource to be updated
        requestPrimitive.setTo("InCSE1/TestAE");
        //Set OneM2m Operation
        requestPrimitive.setOperation(OneM2M.Operation.UPDATE.value());
        requestPrimitive.setRequestIdentifier("12345");
/*        requestPrimitive.setPrimitiveContent(new PrimitiveContent());
        //Request carry resource content
        requestPrimitive.getPrimitiveContent().getAny().add(ae);*/

        requestPrimitive.setStringpayload(updateAEpayload);
        //Exchange carry the updated content of request and destination of request
        Exchange exchange=new Exchange();
        exchange.setHost("localhost");
        exchange.setPort("8282");
        exchange.setRequestPrimitive(requestPrimitive);

        //Initialization of Http client responsible for transmission.
        Http http=new Http();
        http.start();
        http.send(exchange);
        http.stop();
        System.out.println(exchange.toString());
    }

    @Test
    public void retrieve(){
        //Request
        RequestPrimitive requestPrimitive=new RequestPrimitive();
        requestPrimitive.setRequestIdentifier("12345");
        requestPrimitive.setFrom("local");
        //Set the path of resource to be retrieved
        requestPrimitive.setTo("InCSE1/AE1");
        //Set OneM2m Operation
        requestPrimitive.setOperation(OneM2M.Operation.RETRIEVE.value());

        //Exchange carry the content of request and destination of request
        Exchange exchange=new Exchange();
        exchange.setHost("localhost");
        exchange.setPort("8282");
        exchange.setRequestPrimitive(requestPrimitive);

        //Initialization of Http client responsible for transmission.
        Http http=new Http();
        http.start();
        http.send(exchange);
        http.stop();
        System.out.println(exchange.toString());
    }

    @Test
    public void delete(){
        //Request
        RequestPrimitive requestPrimitive=new RequestPrimitive();
        requestPrimitive.setFrom("local");
        requestPrimitive.setRequestIdentifier("12345");

        //Set the path of resource to be deleted
        requestPrimitive.setTo("InCSE1/AE1");
        requestPrimitive.setOperation(OneM2M.Operation.DELETE.value());

        //Exchange carry the content of request and destination of request
        Exchange exchange=new Exchange();
        exchange.setHost("localhost");
        exchange.setPort("8282");
        exchange.setRequestPrimitive(requestPrimitive);

        //Initialization of Http client responsible for transmission.
        Http http=new Http();
        http.start();
        http.send(exchange);
        http.stop();
        System.out.println(exchange.toString());
    }

    @Test
    public void createContainerUnderAE(){
        //Container Resource to be created
//        Cnt container=new Cnt();
//        container.setOr("container");
//        container.setMni(BigInteger.TEN);
        //Request carrying Container to be created.
        RequestPrimitive requestPrimitive=new RequestPrimitive();
        requestPrimitive.setFrom("local");
        //Set Destination under which a container will be created
        requestPrimitive.setTo("InCSE1/AE1");
        //Resource Name of container to be created
        requestPrimitive.setName("container1");
        //Set OneM2m Operation
        requestPrimitive.setOperation(OneM2M.Operation.CREATE.value());
        requestPrimitive.setRequestIdentifier("12345");
        //Set ResourceType to be created
        requestPrimitive.setResourceType(OneM2M.ResourceType.CONTAINER.value());
//        requestPrimitive.setPrimitiveContent(new PrimitiveContent());
        //Request carry resource content
        //requestPrimitive.getPrimitiveContent().getAny().add(container);

        //Exchange carry the content of request and destination of request
        Exchange exchange=new Exchange();
        exchange.setHost("localhost");
        exchange.setPort("8282");
        exchange.setRequestPrimitive(requestPrimitive);

        //Initialization of Http client responsible for transmission.
        Http http=new Http();
        http.start();
        http.setContentType(OneM2M.ResourceType.CONTAINER.value());
        http.send(exchange);
        http.stop();
        System.out.println(exchange.toString());
    }

    @Test
    public void createContentInstanceUnderContainer(){
//        //Container Resource to be created
//        Container container=new Container();
//        container.setOntologyRef("container");
//        //Request carrying Container to be created.
//        RequestPrimitive requestPrimitive=new RequestPrimitive();
//        requestPrimitive.setFrom("local");
//        //Set Destination under which a container will be created
//        requestPrimitive.setTo("InCSE1");
//        //Resource Name of container to be created
//        requestPrimitive.setName("container2");
//        //Set OneM2m Operation
//        requestPrimitive.setOperation(OneM2M.Operation.CREATE.value());
//        requestPrimitive.setRequestIdentifier("12345");
//        //Set ResourceType to be created
//        requestPrimitive.setResourceType(OneM2M.ResourceType.CONTAINER.value());
//        requestPrimitive.setPrimitiveContent(new PrimitiveContent());
//        //Request carry resource content
//        requestPrimitive.getPrimitiveContent().getAny().add(container);
//
//        //Exchange carry the content of request and destination of request
        Exchange exchange=new Exchange();
        exchange.setHost("localhost");
        exchange.setPort("8282");
//        exchange.setRequestPrimitive(requestPrimitive);
//
//        //Initialization of Http client responsible for transmission.
        Http http=new Http();
//        http.start();
//        http.setContentType(OneM2M.ResourceType.CONTAINER.value());
//        http.send(exchange);
//        http.stop();
//        System.out.println(exchange.toString());


        RequestPrimitive primitive = new RequestPrimitive();
        primitive.setOperation(OneM2M.Operation.CREATE.value());
        primitive.setFrom("dslink");
        primitive.setTo("InCSE1/container2");
        primitive.setRequestIdentifier("12345");
//        Cin conIn = new Cin();
//        conIn.setCon("contententdssds");

//        primitive.setPrimitiveContent(new PrimitiveContent());
//        primitive.getPrimitiveContent().getAny().add(conIn);

        String conpayload = "{\"m2m:cin\":{\"con\":\"rsdfd\"}}";
        primitive.setStringpayload(conpayload);
        exchange.setRequestPrimitive(primitive);

        http.start();
        http.setContentType(OneM2M.ResourceType.CONTENT_INSTANCE.value());
        http.send(exchange);
        http.stop();
        System.out.println(exchange.toString());


    }
}
