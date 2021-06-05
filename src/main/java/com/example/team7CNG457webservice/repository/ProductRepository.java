package com.example.team7CNG457webservice.repository;

import com.example.team7CNG457webservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
