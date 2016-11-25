package com.github.webee.json;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by webee on 16/11/25.
 */
public final class Utils {
    /**
     * judge value's json type.
     * @param value the value to judge.
     * @return the json type.
     */
    public static JSONType getType(Object value) {
        if (value == null) {
            return JSONType.Null;
        }

        if (value instanceof String) {
            return JSONType.String;
        } else if (value instanceof Number) {
            return JSONType.Number;
        } else if (value instanceof Boolean) {
            return JSONType.Boolean;
        } else if (value instanceof Map) {
            return JSONType.Object;
        } else if (value instanceof Object[]) {
            return JSONType.Array;
        } else if (value instanceof JSONObject) {
            return JSONType.Object;
        } else if (value instanceof JSONArray) {
            return JSONType.Array;
        }
        return null;
    }

    /**
     * convert JSONArray to a Object[] array mixed tree with pure java objects.
     * @param array the JSONArray to convert.
     * @return the pure java objects array mixed tree.
     */
    public static Object[] arrayToObjects(JSONArray array) {
        if (array == null) {
            return null;
        }
        Object[] res = new Object[array.size()];
        for (int i=0; i < array.size(); i++) {
            res[i] = array.get(i);
        }

        return res;
    }

    /**
     * convert JSONObject to a Map tree with pure java objects.
     * @param object the JSONObject to convert.
     * @return the pure java objects tree .
     */
    public static Map<String, Object> objectToMap(JSONObject object) {
        if (object == null) {
            return null;
        }
        Map<String, Object> res = new HashMap<>();
        for (String key : object.keySet()) {
            res.put(key, object.get(key));
        }

        return res;
    }

    /**
     * convert value to pure java objects.
     * @param value the value to convert.
     * @return pure java object.
     */
    public static Object resolveValue(Object value) {
        if (value instanceof JSONArray) {
            return Utils.arrayToObjects((JSONArray) value);
        } else if (value instanceof JSONObject) {
            return Utils.objectToMap((JSONObject) value);
        }
        return value;
    }
}
