package org.opendaylight.iotdm.client.api;

/**
 * Created by wenxshi on 6/9/15.
 */
public interface RestconfApi {
    public final static String URL="http://localhost:8181/restconf/operations/onem2m:onem2m-cse-provisioning";
    public final static String PAYLOAD="{    \"input\": {\n" +
            "        \"onem2m-primitive\": [\n" +
            "           {\n" +
            "                \"name\": \"CSE_ID\",\n" +
            "                \"value\": \"InCSE1\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"name\": \"CSE_TYPE\",\n" +
            "                \"value\": \"IN-CSE\"\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";
    public final static String USERNAME="admin";
    public final static String PASSWORD="admin";
    public void restConf(String url,String payload,String username,String password);
}
