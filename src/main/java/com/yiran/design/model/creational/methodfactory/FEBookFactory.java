package com.yiran.design.model.creational.methodfactory;

/**
 * FE书籍工厂
 * Created by Ale on 2021/3/6
 */
public class FEBookFactory extends BookFactory {

    @Override
    public Book getBook() {
        return new FEBook();
    }
}
