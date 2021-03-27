package com.yiran.design.model.structural.decorator.v2;

/**
 * Created by Ale on 2021/3/27
 */
public class BatterCake extends ABatterCake {
    private String name;
    private int price;

    public BatterCake(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getDesc() {
        return getName();
    }

    @Override
    public int cost() {
        return getPrice();
    }

    @Override
    public void remove() {

    }
}
