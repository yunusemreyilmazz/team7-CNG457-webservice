package com.example.team7CNG457webservice.service;

import com.example.team7CNG457webservice.entity.Phone;
import com.example.team7CNG457webservice.entity.Product;
import com.example.team7CNG457webservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }


    /*public String savePhone(Product product){ //Writes the data to Phone table
        for(Phone phone : product.getPhones()){
            phone.setProduct(product);
        }
        product.setPhones(product.getPhones());
        productRepository.save(product);
        return "saved";
    }*/


    public Product getProduct(int id){
        return productRepository.findById(id).orElse(null);
    }
}
