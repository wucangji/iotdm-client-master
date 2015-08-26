package org.opendaylight.iotdm.client.api;

import org.opendaylight.iotdm.client.Exchange;

/**
 * Created by wenxshi on 6/2/15.
 */
public interface ClientApi {
    public void start();
    public void stop();
    public void send(Exchange iotdmExchange);
}
