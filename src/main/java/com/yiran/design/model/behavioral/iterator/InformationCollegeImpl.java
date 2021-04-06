package com.yiran.design.model.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Ale on 2021/4/2
 */
public class InformationCollegeImpl implements College{
    private List<Department> departments;


    public InformationCollegeImpl() {
        this.departments = new ArrayList<>();
    }

    @Override
    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    @Override
    public Iterator createIterator() {
        return new InformationCollegeIterator(departments);
    }
}
