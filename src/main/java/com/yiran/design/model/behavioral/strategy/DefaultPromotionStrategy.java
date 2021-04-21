package com.yiran.design.model.behavioral.strategy;

/**
 * Created by Ale on 2021/4/7
 */
public class DefaultPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("空策略");
    }
}
