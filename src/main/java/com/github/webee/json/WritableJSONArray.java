package com.github.webee.json;

/**
 * Created by webee on 16/12/16.
 */
public interface WritableJSONArray extends JSONArray {
    boolean push(Object value);
    Object set(int index, Object value);
    Object remove(int index);
}
