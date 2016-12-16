package com.github.webee.json;

/**
 * Created by webee on 16/12/16.
 */
public interface WritableJSONObject extends JSONObject {
    Object set(String key, Object value);
    Object remove(String key);
}
