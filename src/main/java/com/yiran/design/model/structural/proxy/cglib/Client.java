package com.yiran.design.model.structural.proxy.cglib;



/**
 * Created by Ale on 2021/3/31
 */
public class Client {

    public static void main(String[] args) {
        User user = (User) new ProxyFactory(new User()).getProxyInstance();
        user.move();

    }
}
