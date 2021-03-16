package com.yiran.design.model.creational.abstractfactory;

/**
 * Created by Ale on 2021/3/8
 */
public class Client {
    public static void main(String[] args) {
        BookFactory bookFactory = new JavaBookFactory();
        Book book = bookFactory.getBook();
        Author author = bookFactory.getAuthor();
        book.produce();
        author.produce();

    }
}
