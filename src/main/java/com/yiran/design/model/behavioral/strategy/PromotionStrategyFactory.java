package com.yiran.design.model.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ale on 2021/4/7
 */
public class PromotionStrategyFactory {

    private final static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(strategyKey.FANXIAN,new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(strategyKey.MANJIAN,new ManJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(strategyKey.LIJIAN,new LiJianPromotionStrategy());
    }

    private PromotionStrategyFactory(){}

    private static PromotionStrategy defaultPromotionStrategy(){
        return new DefaultPromotionStrategy();
    }


    public static PromotionStrategy getPromotionStrategy(String key){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(key);
        return promotionStrategy == null ? defaultPromotionStrategy() : promotionStrategy;
    }

    private interface strategyKey{
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }
}
