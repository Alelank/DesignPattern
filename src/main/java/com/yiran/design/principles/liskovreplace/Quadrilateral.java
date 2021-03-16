package com.yiran.design.principles.liskovreplace;

/**
 * 四边形
 * Created by Ale on 2021/3/1
 */
public interface Quadrilateral {
    /**
     * 获取宽度
     * @return long
     */
    long getWidth();

    /**
     * 获取长度
     * @return long
     */
    long getLength();
}
