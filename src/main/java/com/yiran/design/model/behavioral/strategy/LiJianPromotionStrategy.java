package com.yiran.design.model.behavioral.strategy;

/**
 * Created by Ale on 2021/4/7
 */
public class LiJianPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("立减策略");
    }
}
