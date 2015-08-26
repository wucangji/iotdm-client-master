package org.opendaylight.iotdm.client.util;

import com.google.gson.*;
import org.opendaylight.iotdm.constant.OneM2M;

import java.util.Map;

/**
 * Created by wenxshi on 3/30/15.
 */
public class Json {

    public static String toShortNameJson(String str) {
        try {
            JsonParser parser = new JsonParser();
            JsonElement object = parser.parse(str);
            JsonElement object1 = parser.parse(str);
            toShortNameJsonHelper(object, object1);
            return object1.toString();
        } catch (Exception e) {
            return str;
        }
    }

    private static void toShortNameJsonHelper(JsonElement element, JsonElement element1) {
        if (element.isJsonObject()) {
            JsonObject object = element.getAsJsonObject();
            JsonObject object1=element1.getAsJsonObject();
            for (Map.Entry<String, JsonElement> entry : object.entrySet()) {
                String shortName = OneM2M.Name.ResourceAttribute.toShortName(entry.getKey());
                if(shortName.equals(entry.getKey())){
                    shortName=OneM2M.Name.ComplexType.toShortName(entry.getKey());
                }
                if (!shortName.equals(entry.getKey())) {
                    JsonElement e = entry.getValue();
                    object1.remove(entry.getKey());
                    object1.add(shortName, e);
                }
                toShortNameJsonHelper(entry.getValue(), object1.get(shortName));
            }
        } else if (element.isJsonArray()) {
            JsonArray array = element.getAsJsonArray();
            JsonArray array1=element1.getAsJsonArray();
            for (int i = 0; i < array.size(); i++) {
                toShortNameJsonHelper(array.get(i), array1.get(i));
            }
        }
    }


    public static String tofullNameJson(String str) {
        try {
            JsonParser parser = new JsonParser();
            JsonElement object = parser.parse(str);
            JsonElement object1 = parser.parse(str);
            tofullNameJsonHelper(object, object1);
            return object1.toString();
        } catch (Exception e) {
            return str;
        }
    }


    private static void tofullNameJsonHelper(JsonElement element, JsonElement element1) {
        if (element.isJsonObject()) {
            JsonObject object = element.getAsJsonObject();
            JsonObject object1=element1.getAsJsonObject();
            for (Map.Entry<String, JsonElement> entry : object.entrySet()) {
                String fullName = OneM2M.Name.ResourceAttribute.toFullName(entry.getKey());
                if(fullName.equals(entry.getKey())){
                    fullName=OneM2M.Name.ComplexType.toFullName(entry.getKey());
                }
                if (!fullName.equals(entry.getKey())) {
                    JsonElement e = entry.getValue();
                    object1.remove(entry.getKey());
                    object1.add(fullName, e);
                }
                tofullNameJsonHelper(entry.getValue(), object1.get(fullName));
            }
        } else if (element.isJsonArray()) {
            JsonArray array = element.getAsJsonArray();
            JsonArray array1=element1.getAsJsonArray();
            for (int i = 0; i < array.size(); i++) {
                tofullNameJsonHelper(array.get(i), array1.get(i));
            }
        }
    }

}
