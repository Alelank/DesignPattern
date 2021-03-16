package com.yiran.design.model.creational.abstractfactory;

/**
 * Created by Ale on 2021/3/8
 */
public class JavaBookAuthor extends Author{
    @Override
    public void produce() {
        System.out.println("录入Java书籍作者");
    }
}
