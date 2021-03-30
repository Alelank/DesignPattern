package com.yiran.design.model.structural.composite;

/**
 * Created by Ale on 2021/3/30
 */
public class Course extends CatalogComponent{

    private String name;
    private int price;

    public Course(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public int getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程名称：" + this.name + "，价格：" + this.price);
    }
}
