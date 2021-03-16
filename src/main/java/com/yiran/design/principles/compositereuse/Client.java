package com.yiran.design.principles.compositereuse;

/**
 * 合成复用原则
 * Created by Ale on 2021/3/1
 */
public class Client {
    public static void main(String[] args) {
        Product product = new Product();
        product.setDbConnection(new MysqlConnection());
        product.addProduct();
    }
}
