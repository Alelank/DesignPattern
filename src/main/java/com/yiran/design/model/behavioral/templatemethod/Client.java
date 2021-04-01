package com.yiran.design.model.behavioral.templatemethod;

/**
 * Created by Ale on 2021/4/1
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("设计模式课程制作开始");
        ACourse designPattern = new DesignPattern();
        designPattern.makeCourse();
        System.out.println("设计模式课程制作结束");


        System.out.println("前端课程制作开始");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程制作开始");
    }
}
