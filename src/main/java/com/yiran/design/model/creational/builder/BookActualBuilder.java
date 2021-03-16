package com.yiran.design.model.creational.builder;

/**
 * Created by Ale on 2021/3/9
 */
public class BookActualBuilder extends BookBuilder{
    private Book book = new Book();

    @Override
    public void builderName(String name) {
        book.setName(name);
    }

    @Override
    public void builderAuthor(String author) {
        book.setAuthor(author);
    }

    @Override
    public void builderContent(String content) {
        book.setContent(content);
    }

    @Override
    public void builderDesc(String desc) {
        book.setDesc(desc);
    }

    @Override
    public void builderPublishingHouse(String publishingHouse) {
        book.setPublishingHouse(publishingHouse);
    }

    @Override
    public void builderPublishingDate(String publishingDate) {
        book.setPublishingDate(publishingDate);
    }

    @Override
    public Book makeBook() {
        return book;
    }
}
