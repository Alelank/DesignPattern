package com.yiran.design.model.behavioral.strategy;

/**
 * Created by Ale on 2021/4/7
 */
public class Client {
    public static void main(String[] args) {
        String key = "LIJIANxxx";

        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(key));
        promotionActivity.executePromotionStrategy();
    }
}
