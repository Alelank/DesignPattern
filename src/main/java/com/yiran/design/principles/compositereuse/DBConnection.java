package com.yiran.design.principles.compositereuse;

/**
 * 数据连接类
 * Created by Ale on 2021/3/1
 */
public abstract class DBConnection {

    /**
     * 获取数据连接对象
     * @return String
     */
    public abstract String getConnection();
}
