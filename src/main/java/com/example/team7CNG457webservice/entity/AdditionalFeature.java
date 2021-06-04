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
@Table(name = "AdditionalFeatures")
public class AdditionalFeature {
    @Id
    @Column(name = "af_ID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int af_id;

    private String additionalFeature;


    @OneToMany(mappedBy = "additionalFeature", cascade = CascadeType.ALL)
    private List<AdditionalFeatureLine> additionalFeatureLines;

}
