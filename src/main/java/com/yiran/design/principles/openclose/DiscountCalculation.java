package com.yiran.design.principles.openclose;

/**
 * 课程折扣计算类
 * Created by Ale on 2021/2/25
 */
public class DiscountCalculation extends JavaCourse{

    public DiscountCalculation(Integer id, String name, double price) {
        super(id, name, price);
    }
    public double getDiscountPrince(){
       return super.getPrice() * 0.8;
    }
}
