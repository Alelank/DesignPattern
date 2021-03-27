package com.yiran.design.model.structural.decorator.v1;

/**
 * Created by Ale on 2021/3/27
 */
public class Client {
    public static void main(String[] args) {
        // 普通煎饼
        BatterCake batterCake = new BatterCake();
        batterCake.setName("煎饼");
        System.out.println(batterCake.getDesc() + "价格：" + batterCake.cost());

        // 加单煎饼
        batterCake = new BatterCakeWithEgg();
        batterCake.setName("煎饼");
        System.out.println(batterCake.getDesc() + "价格：" + batterCake.cost());

        // 加单加香肠的煎饼
        batterCake = new BatterCakeWithSausage();
        batterCake.setName("煎饼");
        System.out.println(batterCake.getDesc() + "价格：" + batterCake.cost());
    }
}
