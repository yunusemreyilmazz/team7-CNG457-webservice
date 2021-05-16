package com.example.team7CNG457webservice.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CommentID implements Serializable {

    @Column (name = "ProductID")
    int ProductID;


    //Add user PK.
}