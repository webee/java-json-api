package com.github.webee.json;

import java.util.Map;

/**
 * Created by webee on 16/11/25.
 */
public interface JSON {
    WritableJSONObject newObject();
    WritableJSONObject newObject(Map<String, Object> map);
    WritableJSONArray newArray();
    WritableJSONArray newArray(Object[] array);
    // parse to JSON domain types.
    Object parse(String text);
    JSONObject parseObject(String text);
    JSONArray parseArray(String text);
}
