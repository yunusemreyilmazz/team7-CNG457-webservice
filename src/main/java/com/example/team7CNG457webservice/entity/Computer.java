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
@Table(name = "Computers")

public class Computer {
    @Id
    @Column (name = "computerID", nullable = false)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int ComputerID;

    private int screenResolution;
    private String processor;
    private int memory;
    private int StorageCapacity;



    @OneToOne(cascade = CascadeType.ALL) //Before flushing error debug
    //@JoinColumn (name = "ProductID", insertable = false, updatable = false)
    private Product product;

}