package com.yiran.design.model.behavioral.iterator;

import java.util.Iterator;

/**
 * Created by Ale on 2021/4/2
 */
public interface College {
    void addDepartment(Department department);

    void removeDepartment(Department department);

    Iterator createIterator();
}
