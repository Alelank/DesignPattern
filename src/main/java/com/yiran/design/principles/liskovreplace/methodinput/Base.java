package com.yiran.design.principles.liskovreplace.methodinput;

import java.util.HashMap;

/**
 * Created by Ale on 2021/3/1
 */
public class Base {
    public void method(HashMap hashMap){
        System.out.println("父类方法被执行");
    }
}
