package com.yiran.design.model.structural.facade;

/**
 * 外观类
 * Created by Ale on 2021/3/25
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift){
        if(!qualifyService.isAvailable(pointsGift)){
            throw new RuntimeException("订单异常");
        }

        if(!pointsPaymentService.isPay(pointsGift)){
            throw new RuntimeException("订单异常");
        }

        String orderNumber = shippingService.shipGift(pointsGift);
        System.out.println("物流单号：" + orderNumber + "，正在准备发往目的地...");

    }
}
