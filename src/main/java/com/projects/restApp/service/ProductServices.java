package com.projects.restApp.service;

import com.projects.restApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServices {
    List<Product> products = new ArrayList<>( Arrays.asList(new Product(101,"Mac Book",159999),new Product(102,"realme GT ME",21000)));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int prodId) {
        return  products.stream().
                filter(p -> p.productId == prodId).
                findFirst().orElse(new Product(prodId,"Not Found",00));
    }

    public Product addProduct(Product prod){
      products.add(prod);
      return prod;
    }

    public Product updateProduct(Product product) {
        int idx =0;
        for (int i=0;i<products.size();i++){
            if (products.get(i).productId == product.productId){
                idx =i;
            }
        }
        products.set(idx,product);

        return products.get(idx);
    }

    public Product deleteProductById(int prodId) {
        int idx =0;
        for (int i=0;i<products.size();i++){
            if (products.get(i).productId == prodId){
                idx =i;
            }
        }
        return products.remove(idx);
    }
}
