package org.opendaylight.iotdm.client.util;

import org.opendaylight.iotdm.constant.OneM2M;
import org.opendaylight.iotdm.primitive.*;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by wenxshi on 3/31/15.
 */
public class RequestPrimitiveFactory {
    public static RequestPrimitive makeDefaultRequestPrimitive() {
//PrimitiveContent construction
        PrimitiveContent pc = new PrimitiveContent();
        Container container=new Container();
        container.setOntologyRef("mobile");
        pc.getAny().add(container);
//FilterCriteria Content construction
        FilterCriteria fc = new FilterCriteria();
        fc.setCreatedAfter(Onem2mDateTime.getCurrDateTime());
        fc.setCreatedBefore(Onem2mDateTime.getCurrDateTime());
        fc.setFilterUsage(BigInteger.ONE);
        fc.getLabels().addAll(Arrays.asList("b", "c", "d"));
//ResponseType construction
        ResponseTypeInfo rti = new ResponseTypeInfo();
        rti.getNotificationURI().add("localhost1");
        rti.getNotificationURI().add("localhost2");
        rti.setResponseTypeValue(OneM2M.ResponseType.BLOCKING_REQUEST.value());
//RequestPrimitive Construction
        RequestPrimitive request = new RequestPrimitive();

        request.setOperation(OneM2M.Operation.CREATE.value());
        request.setTo("http://localhost:8282/InCSE1");
        request.setFrom("http://localhost:8989");
        request.setRequestIdentifier("1234");
        request.setResourceType(OneM2M.ResourceType.CONTAINER.value());
        request.setPrimitiveContent(pc);
        request.setOriginatingTimestamp(Onem2mDateTime.getCurrDateTime());
        request.setResponseType(rti);

        request.setResultContent(OneM2M.ResultContent.ATTRIBUTES.value());
        request.setEventCategory(OneM2M.StdEventCats.DEFAULT.value().toString());
        request.setDeliveryAggregation(true);
        request.setGroupRequestIdentifier("12345");
        request.setFilterCriteria(fc);
        request.setDiscoveryResultType(OneM2M.DiscResType.HIERARCHICAL.value());
        return request;
    }
}
