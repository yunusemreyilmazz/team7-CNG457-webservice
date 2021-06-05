package com.example.team7CNG457webservice.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "product_id")
public class Product {
    @Id
    @Column(name = "ProductID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    private String brand;
    private String model;
    private int screenSize;
    private int price;



    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    Computer computer;

    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL)
    Phone phone;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    List<Comment> comments;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    List<AdditionalFeatureLine> additionalFeatureLines;
}