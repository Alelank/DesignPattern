package com.yiran.design.model.creational.builder;

/**
 * Created by Ale on 2021/3/9
 */
public class Coach {
    private BookBuilder bookBuilder;

    public void setBookBuilder(BookBuilder bookBuilder) {
        this.bookBuilder = bookBuilder;
    }

    public Book makeBook(String name,String author,String content,String desc,String publishingHouse,String publishingDate){
        this.bookBuilder.builderName(name);
        this.bookBuilder.builderAuthor(author);
        this.bookBuilder.builderContent(content);
        this.bookBuilder.builderDesc(desc);
        this.bookBuilder.builderPublishingHouse(publishingHouse);
        this.bookBuilder.builderPublishingDate(publishingDate);
        return this.bookBuilder.makeBook();
    }
}
