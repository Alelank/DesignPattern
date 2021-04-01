package com.yiran.design.model.structural.proxy.dynamicproxy;

/**
 * Created by Ale on 2021/3/31
 */
public class Client {

    public static void main(String[] args) {
        IFurniture target = new User();
        IFurniture instance = (IFurniture) new ProxyFactory(target).getProxyInstance();
        instance.move();
    }
}
