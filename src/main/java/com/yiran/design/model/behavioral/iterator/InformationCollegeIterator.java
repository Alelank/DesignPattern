package com.yiran.design.model.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Ale on 2021/4/2
 */
public class InformationCollegeIterator implements Iterator {
    List<Department> departments;
    private int index = -1;

    public InformationCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return index >= departments.size() -1 ? false : true;
    }

    @Override
    public Object next() {
        ++index;
        return departments.get(index);
    }

    @Override
    public void remove() {

    }
}
