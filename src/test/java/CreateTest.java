import org.junit.BeforeClass;
import org.junit.Test;
import org.opendaylight.iotdm.client.Exchange;
import org.opendaylight.iotdm.client.api.RestconfApi;
import org.opendaylight.iotdm.client.impl.Http;
import org.opendaylight.iotdm.constant.OneM2M;
import org.opendaylight.iotdm.primitive.*;

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
        AE ae=new AE();
        ae.setAppName("1234");
        ae.setAppID("5678");
        ae.setOntologyRef("iphone");
        //Request carrying AE to be created.
        RequestPrimitive requestPrimitive=new RequestPrimitive();
        requestPrimitive.setFrom("local");
        //Set Destination from root of Resource for creation
        requestPrimitive.setTo("InCSE1");
        //Resource Name of resource to be created
        requestPrimitive.setName("AE1");
        //Set OneM2m Operation
        requestPrimitive.setOperation(OneM2M.Operation.CREATE.value());
        requestPrimitive.setRequestIdentifier("12345");
        //Set ResourceType to be created
        requestPrimitive.setResourceType(OneM2M.ResourceType.AE.value());
        requestPrimitive.setPrimitiveContent(new PrimitiveContent());
        //Request carry resource content
        requestPrimitive.getPrimitiveContent().getAny().add(ae);

        //Exchange carry the content of request and destination of request
        Exchange exchange=new Exchange();
        exchange.setHost("64.103.37.47");
        exchange.setPort("8888");
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
        AE ae=new AE();

        //Updated Attribute
        ae.setOntologyRef("ipad");

        //Request carrying AE to be updated.
        RequestPrimitive requestPrimitive=new RequestPrimitive();
        requestPrimitive.setFrom("local");
        //Set path of resource to be updated
        requestPrimitive.setTo("InCSE1/AE1");
        //Set OneM2m Operation
        requestPrimitive.setOperation(OneM2M.Operation.UPDATE.value());
        requestPrimitive.setRequestIdentifier("12345");
        requestPrimitive.setPrimitiveContent(new PrimitiveContent());
        //Request carry resource content
        requestPrimitive.getPrimitiveContent().getAny().add(ae);

        //Exchange carry the updated content of request and destination of request
        Exchange exchange=new Exchange();
        exchange.setHost("64.103.37.47");
        exchange.setPort("8888");
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
        exchange.setHost("64.103.37.47");
        exchange.setPort("8888");
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
        exchange.setHost("64.103.37.47");
        exchange.setPort("8888");
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
        Container container=new Container();
        container.setOntologyRef("container");
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
        requestPrimitive.setPrimitiveContent(new PrimitiveContent());
        //Request carry resource content
        requestPrimitive.getPrimitiveContent().getAny().add(container);

        //Exchange carry the content of request and destination of request
        Exchange exchange=new Exchange();
        exchange.setHost("64.103.37.47");
        exchange.setPort("8888");
        exchange.setRequestPrimitive(requestPrimitive);

        //Initialization of Http client responsible for transmission.
        Http http=new Http();
        http.start();
        http.setContentType(OneM2M.ResourceType.CONTAINER.value());
        http.send(exchange);
        http.stop();
        System.out.println(exchange.toString());
    }
}
