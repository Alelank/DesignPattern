package com.yiran.design.model.behavioral.iterator;

import java.util.Iterator;

/**
 * Created by Ale on 2021/4/2
 */
public class ComputerCollegeImpl implements College{

    private Department[] departments;
    private int position = 0;

    public ComputerCollegeImpl() {
        this.departments = new Department[5];
    }

    @Override
    public void addDepartment(Department department) {
        departments[position] = department;
    }

    @Override
    public void removeDepartment(Department department) {

    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
