package com.yiran.design.principles.liskovreplace.methodinput;

import java.util.HashMap;

/**
 * Created by Ale on 2021/3/1
 */
public class Client {
    public static void main(String[] args) {
        Child child = new Child();
        child.method(new HashMap());
    }
}
