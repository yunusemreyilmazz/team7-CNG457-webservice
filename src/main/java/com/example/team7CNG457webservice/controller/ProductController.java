package com.example.team7CNG457webservice.controller;

import com.example.team7CNG457webservice.entity.Phone;
import com.example.team7CNG457webservice.entity.Product;
import com.example.team7CNG457webservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/addproduct")
    public Product saveProduct(@RequestBody Product product){

        return productService.saveProduct(product);
    }

    /*@PostMapping("/addproductphone")
    public String savePhone(Product product){ //Writes the data to Phone table
        productService.savePhone(product);
        return "saved";
    }*/


    @GetMapping("/getproduct/{id}")  //Here we are wanting PathVariable {id}
    public Product getProduct(@PathVariable int id){
        return productService.getProduct(id);
    }
}
