package com.yiran.design.principles.ddis;

/**
 * 依赖倒置原则
 * Created by Ale on 2021/2/27
 */
public class Client {
    public static void main(String[] args) {
        Ale ale = new Ale();
        ale.setCourse(new JavaCourse());
        ale.study();

        ale.setCourse(new AngularCourse());
        ale.study();

        ale.setCourse(new MysqlCourse());
        ale.study();
    }
}
