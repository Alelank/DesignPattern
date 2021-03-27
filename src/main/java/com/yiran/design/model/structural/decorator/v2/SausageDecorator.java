package com.yiran.design.model.structural.decorator.v2;

/**
 * Created by Ale on 2021/3/27
 */
public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABatterCake aBatterCake) {
        super(aBatterCake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " + 加香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }

    @Override
    public void remove() {

    }


}
