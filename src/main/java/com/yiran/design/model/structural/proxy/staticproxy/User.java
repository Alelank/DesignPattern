package com.yiran.design.model.structural.proxy.staticproxy;

/**
 * Created by Ale on 2021/3/30
 */
public class User implements IFurniture{

    @Override
    public void move() {
        System.out.println("开始搬运");
    }
}
