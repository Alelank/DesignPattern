package com.yiran.design.principles.compositereuse;

/**
 * Created by Ale on 2021/3/1
 */
public class OracleConnection extends DBConnection {

    @Override
    public String getConnection() {
        return "Oracle连接对象";
    }
}
