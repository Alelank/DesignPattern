package com.yiran.design.model.creational.simplefactory;

/**
 * 简单工厂
 * Created by Ale on 2021/3/4
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Book book = BookSimpleFactory.getBook("java");
        if(book == null){
            System.out.println("书籍对象不存在");
            return;
        }
        book.produce();
    }
}
