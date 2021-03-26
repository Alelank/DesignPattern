package com.yiran.design.model.structural.facade;


/**
 * 外观模式-客户端调用
 * Created by Ale on 2021/3/25
 */
public class Client {
    public static void main(String[] args) {
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(new PointsGift("T恤"));
    }
}
