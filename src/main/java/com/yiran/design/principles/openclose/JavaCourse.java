package com.yiran.design.principles.openclose;

/**
 * Java课程
 * Created by Ale on 2021/2/25
 */
public class JavaCourse implements ICourse{
    private Integer id;
    private String name;
    private double price;

    public JavaCourse(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
