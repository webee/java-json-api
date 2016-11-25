package com.github.webee.json;

/**
 * Created by webee on 16/11/25.
 */
public interface JSON {
    JSONObject newObject();
    JSONArray newArray();
    JSONObject parseObject(String text);
    JSONArray parseArray(String text);
}