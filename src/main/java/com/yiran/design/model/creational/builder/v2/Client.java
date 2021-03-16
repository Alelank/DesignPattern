package com.yiran.design.model.creational.builder.v2;

/**
 * 客户端
 * Created by Ale on 2021/3/9
 */
public class Client {
    public static void main(String[] args) {
        Book book = new Book.BookBuilder()
                .builderName("西游记")
                .builderAuthor("吴承恩")
                .builderContent("西天取经")
                .builderDesc("描述")
                .builder();
        System.out.println(book);
    }
}
