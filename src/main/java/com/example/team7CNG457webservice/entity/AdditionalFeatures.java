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
@Table(name="Additional")
public class AdditionalFeatures {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "afID")
    private int afID;
    private int batteryLife;
    private String touchScreen;
    private String fingerPrint;
    private int extraBattery;


    @ManyToMany
    //  @JoinTable(name="ProductFeature",joinColumns = @JoinColumn(name="ProductID"),inverseJoinColumns = @JoinColumn(name="afID"))
    private List<Product> product;

    /*@OneToMany(mappedBy = "af",cascade = CascadeType.ALL)
    private List<AdditionalFeaturesLine> additionalFeatureline;*/




}