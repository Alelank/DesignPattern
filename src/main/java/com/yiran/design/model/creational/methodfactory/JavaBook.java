package com.yiran.design.model.creational.methodfactory;

/**
 * Java书籍
 * Created by Ale on 2021/3/6
 */
public class JavaBook extends Book{

    @Override
    public void produce() {
        System.out.println("Java书籍生产");
    }
}
