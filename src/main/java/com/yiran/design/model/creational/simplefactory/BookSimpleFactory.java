package com.yiran.design.model.creational.simplefactory;

import java.util.Locale;

/**
 * Created by Ale on 2021/3/4
 */
public class BookSimpleFactory {

    /**
     * 客户端通过工厂类决定获取所需书籍
     * @param type
     * @return
     */
    public static Book getBook(String type){
        switch (type.toLowerCase(Locale.ROOT)){
            case "java":
                return new JavaBook();
            case "python":
                return new PythonBook();
            default:
                return null;
        }
    }
}
