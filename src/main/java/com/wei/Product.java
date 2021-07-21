package com.wei;

public class Product {
    // 屬性 Field , Property
    int id; // 成員, Member
    String name; // 成員, Member
    int price = 1; // 成員, Member

    public Product() {
        super();
    }

    // Constructor
    public Product(int id, String name, int price) {
        this(name, price);
        this.id = id;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 方法 method
    void publish() { // 成員, Member

    }

}
