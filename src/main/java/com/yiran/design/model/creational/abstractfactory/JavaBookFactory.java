package com.yiran.design.model.creational.abstractfactory;

/**
 * Created by Ale on 2021/3/8
 */
public class JavaBookFactory implements BookFactory{
    @Override
    public Book getBook() {
        return new JavaBook();
    }

    @Override
    public Author getAuthor() {
        return new JavaBookAuthor();
    }
}
