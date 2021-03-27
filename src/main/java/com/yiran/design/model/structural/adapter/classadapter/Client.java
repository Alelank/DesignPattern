package com.yiran.design.model.structural.adapter.classadapter;

/**
 * Created by Ale on 2021/3/27
 */
public class Client {
    public static void main(String[] args) {
        ITarget iTarget = new ConcreteTarget();
        iTarget.request();


        ITarget iTarget1 = new Adapter();
        iTarget1.request();

    }
}
