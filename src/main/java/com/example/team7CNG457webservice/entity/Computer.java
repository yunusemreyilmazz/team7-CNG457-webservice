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
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int computerID;

    private int screenResolution;
    private String processor;
    private int memory;
    private int StorageCapacity;

    @OneToOne(cascade = CascadeType.ALL)
    Product product;



}
