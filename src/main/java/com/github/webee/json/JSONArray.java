package com.github.webee.json;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by webee on 16/11/25.
 */
public interface JSONArray {
    int size();
    JSONType getType(int index);

    boolean isNull(int index);
    // get the pure java object that correspond to it's type.
    Object[] get();
    Object get(int index);
    Boolean getBoolean(int index);
    BigDecimal getBigDecimal(int index);
    BigInteger getBigInteger(int index);
    Double getDouble(int index);
    Integer getInteger(int index);
    Long getLong(int index);
    String getString(int index);
    JSONArray getArray(int index);
    JSONObject getObject(int index);

    String toJSONString();
}
