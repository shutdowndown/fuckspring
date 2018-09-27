package com.example.fuckspring.utils;

import com.example.fuckspring.enums.CodeEnum;

/**
 * @ClassName EnumUtil
 * @Author Fixed
 * @Date 2018/9/25
 **/

public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

}
