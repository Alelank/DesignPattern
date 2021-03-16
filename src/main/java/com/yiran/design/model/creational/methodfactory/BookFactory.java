package com.yiran.design.model.creational.methodfactory;

/**
 * Created by Ale on 2021/3/6
 */
public abstract class BookFactory {

    /**
     * 通过具体工厂获取对应实例(书籍)
     */
    public abstract Book getBook();
}
