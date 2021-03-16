package com.yiran.design.model.creational.builder.v2;

/**
 * Created by Ale on 2021/3/9
 */
public class Book {
    private String name;            // 名称
    private String author;          // 作者
    private String content;         // 内容
    private String desc;            // 描述
    private String publishingHouse; // 出版社
    private String publishingDate;  // 出版日期

    public Book(BookBuilder bookBuilder) {
        this.name = bookBuilder.name;
        this.author = bookBuilder.author;
        this.content = bookBuilder.content;
        this.desc = bookBuilder.desc;
        this.publishingHouse = bookBuilder.publishingHouse;
        this.publishingDate = bookBuilder.publishingDate;
    }



    /**
     * 静态内部类
     */
    public static class BookBuilder {
        private String name;            // 名称
        private String author;          // 作者
        private String content;         // 内容
        private String desc;            // 描述
        private String publishingHouse; // 出版社
        private String publishingDate;  // 出版日期

        public BookBuilder builderName(String name){
            this.name = name;
            return this;
        }
        public BookBuilder builderAuthor(String author){
            this.name = name;
            return this;
        }
        public BookBuilder builderContent(String content){
            this.content = content;
            return this;
        }
        public BookBuilder builderDesc(String desc){
            this.desc = desc;
            return this;
        }
        public BookBuilder builderPublishingHouse(String publishingHouse){
            this.publishingHouse = publishingHouse;
            return this;
        }
        public BookBuilder builderPublishingDate(String publishingDate){
            this.publishingDate = publishingDate;
            return this;
        }

        public Book builder(){
            return new Book(this);
        }
    }
}
