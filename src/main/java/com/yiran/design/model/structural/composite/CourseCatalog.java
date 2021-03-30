package com.yiran.design.model.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ale on 2021/3/30
 */
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<>();
    private String name;
    private int lev;

    public CourseCatalog(String name, int lev) {
        this.name = name;
        this.lev = lev;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name + "目录：");
        items.forEach(item -> {
            for (int i = 0; i < this.lev; i++) {
                System.out.print(" ");
            }
            item.print();
        });
    }
}
