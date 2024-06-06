package com.projects.restApp.model;


import org.springframework.stereotype.Component;

@Component
public class Product {
    Product(){

    }
    public int productId;
    public String productName;
    public int Price;

    public Product(int productId, String productName, int price) {
        this.productId = productId;
        this.productName = productName;
        this.Price = price;
    }
}
