package com.yiran.design.model.creational.singleton.hungry;

import java.io.Serializable;

/**
 * 单例-饿汉模式
 * Created by Ale on 2021/3/24
 */
public class HungrySingleton implements Serializable {

    private HungrySingleton() {
        if(HUNGRY_SINGLETON != null){
            throw new RuntimeException("禁止单例被反射破坏");
        }
    }

    private final static HungrySingleton HUNGRY_SINGLETON;

    static {
        HUNGRY_SINGLETON = new HungrySingleton();
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    /**
     * 防止序列化破坏单例模式
     * @return
     */
    public Object readResolve() {
            return HUNGRY_SINGLETON;
    }
}
