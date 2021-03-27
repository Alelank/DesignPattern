package com.yiran.design.model.structural.decorator.v1;

/**
 * Created by Ale on 2021/3/27
 */
public class BatterCakeWithSausage extends BatterCakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc() + " + 香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
