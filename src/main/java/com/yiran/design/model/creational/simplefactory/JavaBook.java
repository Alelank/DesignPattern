package com.yiran.design.model.creational.simplefactory;

/**
 * Created by Ale on 2021/3/4
 */
public class JavaBook extends Book {

    @Override
    public void produce() {
        System.out.println("Java书籍生产");
    }
}
