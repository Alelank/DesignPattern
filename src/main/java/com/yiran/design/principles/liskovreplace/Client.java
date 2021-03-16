package com.yiran.design.principles.liskovreplace;

/**
 * 里氏替换原则
 * Created by Ale on 2021/3/1
 */
public class Client {
    private static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width:" + rectangle.getWidth() + ",length:" + rectangle.getLength());
        }
        System.out.println("循环结束：width:" + rectangle.getWidth() + ",length:" + rectangle.getLength());
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setLength(20);
//        Suare suare = new Suare();
//        suare.setSideLength(10);
        resize(rectangle);
    }
}
