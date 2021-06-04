package com.example.team7CNG457webservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AdditionalFeatureLine {
    @EmbeddedId
    AfId id;

    @ManyToOne
    @JoinColumn(name="product_id",insertable = false,updatable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name="af_id", insertable = false,updatable = false)
    private AdditionalFeature additionalFeature;
}
