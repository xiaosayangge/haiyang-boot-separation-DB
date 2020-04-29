package com.hy.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;

/**
* GsonUtils
* Creater by chenhaiyang on 2020年4月29日
 */
public class GsonUtils {
    private static final Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    
    private static final Gson gsonFormatDate = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
    
    private static final Gson gsonFormat = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

    public static Gson createGson(){
        return gson;
    }

    public static Gson createGsonFormat(){
        return gsonFormat;
    }

    public static <T> String toJson(T t){
        return gson.toJson(t);
    }

    public static <T> String toJsonFormatDate(T t){
        return gsonFormatDate.toJson(t);
    }
    
    public static <T> String toJsonFormat(T t){
        return gsonFormat.toJson(t);
    }

    public static <T> T fromJson(String json, Class<T> clazzT){
        return gson.fromJson(json, clazzT);
    }

    public static <T> T fromJson(String json , Type type){
        return gson.fromJson(json, type);
    }

    public static <T> T fromJsonFormat(String json, Class<T> clazzT){
        return gsonFormat.fromJson(json, clazzT);
    }

    public static <T> T fromJsonFormat(String json, Type type){
        return gsonFormat.fromJson(json, type);
    }
}
