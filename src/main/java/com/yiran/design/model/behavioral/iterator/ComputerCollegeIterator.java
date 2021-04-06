package com.yiran.design.model.behavioral.iterator;

import java.util.Iterator;

/**
 * Created by Ale on 2021/4/2
 */
public class ComputerCollegeIterator implements Iterator {
    private Department[] departments;
    private int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length) {
            return false;
        } else {
            if (departments[position] == null) {
                ++position;
            }
            return true;
        }
    }

    @Override
    public Object next() {
        ++position;
        return departments[position];
    }

    @Override
    public void remove() {

    }

}
