package com.yiran.design.model.creational.methodfactory;

/**
 * Python书籍
 * Created by Ale on 2021/3/6
 */
public class PythonBook extends Book{
    @Override
    public void produce() {
        System.out.println("Python书籍生产");
    }
}
