package com.yiran.design.principles.openclose;

/**
 *  课程接口
 * Created by Ale on 2021/2/25
 */
public interface ICourse {

    /**
     * 返回课程id
     * @return Integer
     */
    Integer getId();

    /**
     * 返回课程名称
     * @return String
     */
    String getName();

    /**
     * 返回课程价格
     * @return double
     */
    double getPrice();
}
