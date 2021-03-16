package com.yiran.design.principles.liskovreplace.methodoutput;

/**
 * Created by Ale on 2021/3/1
 */
public class Client {
    public static void main(String[] args) {
        Base child = new Child();
        child.method();
    }
}
