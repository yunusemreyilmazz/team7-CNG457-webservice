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
@Table(name = "AdditionalFeatures")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "af_id")
public class AdditionalFeature {
    @Id
    @Column(name = "afID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int af_id;

    private String additionalFeature;


    @OneToMany(mappedBy = "additionalFeature", cascade = CascadeType.ALL)
    private List<AdditionalFeatureLine> additionalFeatureLines;

}
