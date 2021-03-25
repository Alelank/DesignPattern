package com.yiran.design.model.creational.singleton.hungry;

/**
 * 枚举单例
 * Created by Ale on 2021/3/25
 */
public enum EnumSingleton {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
