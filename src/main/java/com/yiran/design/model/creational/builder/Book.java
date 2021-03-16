package com.yiran.design.model.creational.builder;

/**
 * Created by Ale on 2021/3/8
 */
public class Book {
    private String name;            // 名称
    private String author;          // 作者
    private String content;         // 内容
    private String desc;            // 描述
    private String publishingHouse; // 出版社
    private String publishingDate;  // 出版日期


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(String publishingDate) {
        this.publishingDate = publishingDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", desc='" + desc + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingDate='" + publishingDate + '\'' +
                '}';
    }
}
