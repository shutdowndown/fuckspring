package com.example.fuckspring.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @ClassName JsonUtil
 * @Author Fixed
 * @Date 2018/9/18
 **/

public class JsonUtil {

    /**
     * 对象转化为Json
     * */
    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
