package com.example.team7CNG457webservice.controller;


import com.example.team7CNG457webservice.entity.Product;
import com.example.team7CNG457webservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * This is a controller for ProductController.
 */
@RestController
public class ProductController {

    @Autowired
    ProductService productService;


    /**
     * Postmapping for creating new Product in the Database.
     * And initializing our URL as "/addProduct".
     * Then specifying our method saveProduct.
     * @param c is Product type object that we want to add to our database.
     * @return calling "saveProduct" method from productService class to save new Product object in the database.
     */
    @PostMapping("/addProduct")
    public Product saveProduct(@RequestBody Product c){
        return productService.saveProduct(c);
    }


    /**
     * Getmapping for reading elements from Database.
     * And initializing our URL as "/getProduct/{id}" which want {id} to search for.
     * @param id - is searching criteria for Product object.
     * @return calling "getProduct" method from productService class to return a Product object from database.
     */
    @GetMapping("/getProduct/{id}")
    public Product getProducts(@PathVariable int id ){
        return productService.getProduct(id);
    }

}
