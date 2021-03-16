package com.yiran.design.model.creational.methodfactory;

/**
 * Java书籍工厂
 * Created by Ale on 2021/3/6
 */
public class JavaBookFactory extends BookFactory{

    @Override
    public Book getBook() {
        return new JavaBook();
    }
}
