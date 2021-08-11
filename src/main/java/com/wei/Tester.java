package com.wei;

import java.util.List;

public class Tester {

    public static void main(String[] args) {
        //購物
        //商品: id, 名, price
//        List<Category> categories = Category.getCategories();
        List<Product> products = Product.getProductsFromFile();
        // 耗時5秒

        for (Product product : products) {
            if (product instanceof SalesProduct) {
                System.out.print("*");
            }
            System.out.println(product);
        }
        //Order
//        OrderItem item = new OrderItem(mouse, 3);
//        OrderItem item2 = new OrderItem(toothbrush);


    }

}
