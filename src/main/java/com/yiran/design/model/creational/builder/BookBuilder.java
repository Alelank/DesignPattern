package com.yiran.design.model.creational.builder;

/**
 * Created by Ale on 2021/3/9
 */
public abstract class BookBuilder {
    public abstract void builderName(String name);
    public abstract void builderAuthor(String author);
    public abstract void builderContent(String content);
    public abstract void builderDesc(String desc);
    public abstract void builderPublishingHouse(String publishingHouse);
    public abstract void builderPublishingDate(String publishingDate);

    public abstract Book makeBook();
}
