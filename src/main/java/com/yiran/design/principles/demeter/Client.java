package com.yiran.design.principles.demeter;

/**
 * 迪米特法则
 * Created by Ale on 2021/2/28
 */
public class Client {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.checkCarNumberCommand(new TeamLeader());
    }
}
