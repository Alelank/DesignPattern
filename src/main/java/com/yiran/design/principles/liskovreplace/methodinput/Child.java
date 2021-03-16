package com.yiran.design.principles.liskovreplace.methodinput;

import java.util.Map;

/**
 * Created by Ale on 2021/3/1
 */
public class Child extends Base{
    public void method(Map map){
        System.out.println("子类被执行");
    }
}
