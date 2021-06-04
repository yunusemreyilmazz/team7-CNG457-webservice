package com.example.team7CNG457webservice.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AfId implements Serializable {
    int af_id;
    int product_id;
}
