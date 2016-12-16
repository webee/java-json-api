package com.github.webee.json;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
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
    Map<String, Object> get();
    Object get(String key);
    Boolean getBoolean(String key);
    BigDecimal getBigDecimal(String key);
    BigInteger getBigInteger(String key);
    Double getDouble(String key);
    Integer getInteger(String key);
    Long getLong(String key);
    String getString(String key);
    JSONArray getArray(String key);
    JSONObject getObject(String key);

    String toJSONString();
}
