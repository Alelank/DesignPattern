package com.yiran.design.model.structural.flyweight;

/**
 * Created by Ale on 2021/3/29
 */
public class Client {
    private static String [] departments = {"QA","RD","PM","ED","DB"};
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department =  departments[(int) (Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
