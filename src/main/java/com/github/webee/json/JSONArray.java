package com.github.webee.json;

/**
 * Created by webee on 16/11/25.
 */
public interface JSONArray {
    int size();
    JSONType getType(int index);

    boolean isNull(int index);
    // get the pure java object that correspond to it's type.
    Object get(int index);
    Boolean getBoolean(int index);
    Integer getInteger(int index);
    Long getLong(int index);
    Double getDouble(int index);
    String getString(int index);
    JSONArray getArray(int index);
    JSONObject getObject(int index);

    boolean push(Object value);
    Object set(int index, Object value);
    Object remove(int index);

    String toJSONString();
}
