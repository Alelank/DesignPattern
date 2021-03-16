package com.yiran.design.model.creational.methodfactory;

/**
 * Python书籍工厂
 * Created by Ale on 2021/3/6
 */
public class PythonBookFactory extends BookFactory{

    @Override
    public Book getBook() {
        return new PythonBook();
    }
}
