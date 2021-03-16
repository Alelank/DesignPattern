package com.yiran.design.model.creational.builder;

/**
 * Created by Ale on 2021/3/9
 */
public class Client {
    public static void main(String[] args) {
        Coach coach = new Coach();
        coach.setBookBuilder(new BookActualBuilder());
        Book book = coach.makeBook(
                "西游记",
                "吴承恩",
                "三打白骨精...",
                "西游记描述",
                "新华社",
                "1997-04-30");
        System.out.println(book);
    }
}
