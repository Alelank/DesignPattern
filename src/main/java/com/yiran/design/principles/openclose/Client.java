package com.yiran.design.principles.openclose;

/**
 * 开闭原则
 * Created by Ale on 2021/2/25
 */
public class Client {
    public static void main(String[] args) {
        JavaCourse javaCourse = new DiscountCalculation(1, "Java虚拟机", 79d);
        DiscountCalculation discountCalculation = (DiscountCalculation) javaCourse;
        System.out.println("课程ID:" + javaCourse.getId());
        System.out.println("课程名称:" + javaCourse.getName());
        System.out.println("课程价格:" + javaCourse.getPrice());
        System.out.println("折后价格:" + discountCalculation.getDiscountPrince());
    }
}
