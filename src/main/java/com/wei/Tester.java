package com.wei;

public class Tester {

    public static void main(String[] args) {
        //購物
        //商品: id, 名, price

        Product toothbrush =
                new Product(1,"牙刷",150); // call constructor (建構子)
        toothbrush.publish();
        Product mouse = new Product("滑鼠",99);

    }

}
