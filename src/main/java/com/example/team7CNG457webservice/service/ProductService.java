package com.example.team7CNG457webservice.service;



import com.example.team7CNG457webservice.entity.Product;
import com.example.team7CNG457webservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;



    public Product saveProduct(Product p){
        return productRepository.save(p);
    }

    public Product getProduct(int id){
        return productRepository.findById(id).orElse(null);
    }
}
