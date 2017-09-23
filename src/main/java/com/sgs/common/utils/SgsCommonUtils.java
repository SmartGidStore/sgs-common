package com.sgs.common.utils;

import java.lang.reflect.Field;
import java.util.Optional;

public class SgsCommonUtils {

    public static boolean isEmpty(Object object){
        if (object == null) return true;
        for (Field field : object.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Optional<Object> value = getValue(field, object);
            if (!value.isPresent())
                return true;
        }
        return false;
    }

    private static Optional<Object> getValue(Field field, Object object) {
        Optional<Object> value = Optional.empty();
        try {
            value = Optional.ofNullable(field.get(object));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return value;
    }

}
