package com.yiran.design.principles.compositereuse;

/**
 * Created by Ale on 2021/3/1
 */
public class Product {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        System.out.println("采用" + dbConnection.getConnection() + "添加产品");
    }
}
