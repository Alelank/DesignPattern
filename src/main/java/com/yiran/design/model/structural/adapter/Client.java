package com.yiran.design.model.structural.adapter;

/**
 * Created by Ale on 2021/3/27
 */
public class Client {
    public static void main(String[] args) {
        IDC5 idc5 = new PowerAdapter();
        idc5.outputDC();
    }
}
