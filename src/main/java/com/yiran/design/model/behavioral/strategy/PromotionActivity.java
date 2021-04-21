package com.yiran.design.model.behavioral.strategy;

/**
 * Created by Ale on 2021/4/7
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }


    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
