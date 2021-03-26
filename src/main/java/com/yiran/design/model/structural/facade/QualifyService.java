package com.yiran.design.model.structural.facade;

/**
 * 奖品校验系统
 * Created by Ale on 2021/3/25
 */
public class QualifyService {

    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("积分校验成功，库存通过");
        return true;
    }
}
