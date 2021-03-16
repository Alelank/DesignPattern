package com.yiran.design.principles.compositereuse;

/**
 * Created by Ale on 2021/3/1
 */
public class MysqlConnection extends DBConnection{

    @Override
    public String getConnection() {
        return "Mysql连接对象";
    }
}
