package com.github.webee.json;

import java.util.Set;

/**
 * Created by webee on 16/11/25.
 */
public interface JSONObject {
    Set<String> keySet();
    boolean hasKey(String key);
    JSONType getType(String key);

    boolean isNull(String key);
    // get the pure java object that correspond to it's type.
    Object get(String key);
    Boolean getBoolean(String key);
    Integer getInteger(String key);
    Long getLong(String key);
    Double getDouble(String key);
    String getString(String key);
    JSONArray getArray(String key);
    JSONObject getObject(String key);

    Object set(String key, Object value);
    Object remove(String key);

    String toJSONString();
}
