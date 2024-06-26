package com.projects.restApp.controller;


import com.projects.restApp.model.Product;
import com.projects.restApp.service.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("store/")
public class ProductController
{
    @Autowired
    ProductServices service;


    @GetMapping ("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProduct(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product prod){
        return service.addProduct(prod);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/deleteProduct/{prodId}")
    public Product deleteProduct(@PathVariable int prodId){
        return service.deleteProductById(prodId);
    }


}
