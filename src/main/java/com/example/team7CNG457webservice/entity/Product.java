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
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="ProductID")
    private int productID;

    private int price;
    private int screenSize;
    private String model;
    private String brand;


    @OneToOne(mappedBy = "product",cascade = CascadeType.ALL)
    private Computer computer;




    @OneToMany(mappedBy = "product")
    List<Comments> com;

    @OneToOne(mappedBy = "product",cascade = CascadeType.ALL)
    private Phone  phone;



    @ManyToMany(mappedBy = "product")
    private List<AdditionalFeatures> additionalFeatures;

}