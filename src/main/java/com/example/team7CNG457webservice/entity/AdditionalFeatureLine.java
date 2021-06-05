package com.example.team7CNG457webservice.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AdditionalFeatureLine {
    @EmbeddedId
    AfId id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="ProductID",insertable = false,updatable = false)
    private Product product;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="afID", insertable = false,updatable = false)
    private AdditionalFeature additionalFeature;
}
