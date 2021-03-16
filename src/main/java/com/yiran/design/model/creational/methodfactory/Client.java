package com.yiran.design.model.creational.methodfactory;

/**
 * 客户端
 * Created by Ale on 2021/3/6
 */
public class Client {
    public static void main(String[] args) {
        BookFactory bookFactory = new JavaBookFactory();
        Book book = bookFactory.getBook();
        book.produce();
    }
}
