package com.yiran.design.model.structural.proxy.staticproxy;

/**
 * Created by Ale on 2021/3/30
 */
public class Client {
    public static void main(String[] args) {
        User user = new User();
        CargoLaLaProxy cargoLaLaProxy = new CargoLaLaProxy(user);
        cargoLaLaProxy.move();
    }
}
