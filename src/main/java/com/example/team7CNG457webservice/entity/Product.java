package com.example.team7CNG457webservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Products")
public class Product {
    @Id
    @Column(name = "ProductID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    private String brand;
    private String model;
    private int screenSize;
    private int price;



    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    List<Computer> computers;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    List<Phone> phones;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    List<Comment> comments;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    List<AdditionalFeature> additionalFeatures;
}