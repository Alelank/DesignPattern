package com.yiran.design.model.creational.abstractfactory;

/**
 * Created by Ale on 2021/3/8
 */
public interface BookFactory {
    /**
     * 获取对应Book
     * @return
     */
    Book getBook();

    /**
     * 获取对应作者
     * @return
     */
    Author getAuthor();
}
