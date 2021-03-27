package com.yiran.design.model.structural.decorator.v2;

/**
 * Created by Ale on 2021/3/27
 */
public class EggDecorator extends AbstractDecorator{


    public EggDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " + 鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }

    @Override
    public void remove() {

    }
}
