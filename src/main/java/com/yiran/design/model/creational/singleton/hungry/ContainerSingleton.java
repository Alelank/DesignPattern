package com.yiran.design.model.creational.singleton.hungry;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例
 * Created by Ale on 2021/3/25
 */
public class ContainerSingleton {
    private static Map<String,Object> container = new HashMap<>();

    private ContainerSingleton(){}
    public static void put(String key,Object instance){
        if(StringUtils.isNotBlank(key) && instance != null){
            if(!container.containsKey(key)){
                container.put(key,instance);
            }
        }
    }


    public static Object getInstance(String key){
        return container.get(key);
    }


}
