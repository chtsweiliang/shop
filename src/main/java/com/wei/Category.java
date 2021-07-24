package com.wei;

import java.util.ArrayList;
import java.util.List;

public class Category {

    static final Category CATEGORY_LIFE = new Category(1, "生活用品");
    static final Category CATEGORY_COMPUTER = new Category(1, "電腦零組用");
//    final float PI=  Float.parseFloat("3.14729");

    int id;
    String name;
    int version = 1;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static List<Category> getDummyCategories() {
        List<Category> list = new ArrayList<>();
        list.add(new Category(1, "生活用品"));
        list.add(new Category(2, "電腦零組用"));
        return list;
    }

    public static List<Category> getCategories() {
        List<Category> list = new ArrayList<>();
        //TODO: read categories  from database

        return list;
    }
}
