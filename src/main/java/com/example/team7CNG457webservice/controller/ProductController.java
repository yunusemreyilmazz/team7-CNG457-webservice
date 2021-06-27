package com.example.team7CNG457webservice.controller;


import com.example.team7CNG457webservice.entity.Product;
import com.example.team7CNG457webservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public Product saveProduct(@RequestBody Product c){
        return productService.saveProduct(c);
    }

    @GetMapping("/getProduct/{id}")
    public Product getProducts(@PathVariable int id ){
        return productService.getProduct(id);
    }

}
