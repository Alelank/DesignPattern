package com.yiran.design.model.structural.facade;

/**
 * 积分支付系统
 * Created by Ale on 2021/3/25
 */
public class PointsPaymentService {

    public boolean isPay(PointsGift pointsGift){
        System.out.println("奖品：" + pointsGift.getName() + "，通过积分支付成功");
        return true;
    }
}
