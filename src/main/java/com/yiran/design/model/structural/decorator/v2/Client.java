package com.yiran.design.model.structural.decorator.v2;

/**
 * Created by Ale on 2021/3/27
 */
public class Client {
    public static void main(String[] args) {
        ABatterCake aBatterCake = new BatterCake("煎饼",7);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);

        System.out.println(aBatterCake.getDesc() + "价格：" + aBatterCake.cost());
    }

}
