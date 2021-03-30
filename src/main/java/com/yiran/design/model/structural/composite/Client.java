package com.yiran.design.model.structural.composite;

/**
 * Created by Ale on 2021/3/30
 */
public class Client {
    public static void main(String[] args) {
        CatalogComponent yiranMain = new CourseCatalog("亦然主目录",1);
        CatalogComponent linuxCourse = new Course("Linux课程",11);
        CatalogComponent winCourse = new Course("Win课程",9);


        CatalogComponent javaCatalog = new CourseCatalog("Java目录",2);
        CatalogComponent jvmCourse = new Course("JVM实战",99);
        CatalogComponent designPattern = new Course("设计模式实战",77);
        javaCatalog.add(jvmCourse);
        javaCatalog.add(designPattern);

        javaCatalog.remove(designPattern);

        yiranMain.add(linuxCourse);
        yiranMain.add(winCourse);
        yiranMain.add(javaCatalog);
        yiranMain.print();
    }
}
