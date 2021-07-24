package com.wei;

import java.util.List;

public class Tester {

    public static void main(String[] args) {
        //購物
        //商品: id, 名, price
        List<Category> categories = Category.getDummyCategories();


//        for (Category category : categories) {
//            System.out.println(category.name);
//        }
        int n = 10;
        Product toothbrush =
                new Product("牙刷",categories.get(0)); // call constructor (建構子)
        toothbrush.publish();
        Product mouse = new Product("滑鼠",categories.get(1));
        System.out.println(mouse.category);
        mouse.publish();

    }

}
