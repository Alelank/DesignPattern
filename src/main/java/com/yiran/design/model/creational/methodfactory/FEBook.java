package com.yiran.design.model.creational.methodfactory;

/**
 * FE书籍
 * Created by Ale on 2021/3/6
 */
public class FEBook extends Book{
    @Override
    public void produce() {
        System.out.println("FE书籍生产");
    }
}
