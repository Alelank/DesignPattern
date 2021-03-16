package com.yiran.design.model.creational.abstractfactory;

/**
 * Created by Ale on 2021/3/8
 */
public class JavaBook extends Book{
    @Override
    public void produce() {
        System.out.println("Java书籍生产");
    }
}
