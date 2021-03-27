package com.yiran.design.model.structural.adapter.objectadapter;

/**
 * Created by Ale on 2021/3/27
 */
public class ConcreteTarget implements ITarget {
    @Override
    public void request() {
        System.out.println("适配方法");
    }
}
