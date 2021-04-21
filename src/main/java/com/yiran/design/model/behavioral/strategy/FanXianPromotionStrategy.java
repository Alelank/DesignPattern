package com.yiran.design.model.behavioral.strategy;

/**
 * Created by Ale on 2021/4/7
 */
public class FanXianPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("返现策略");
    }
}
