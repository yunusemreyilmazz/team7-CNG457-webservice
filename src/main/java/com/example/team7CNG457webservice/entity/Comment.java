package com.example.team7CNG457webservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Comments")
public class Comment {

    @EmbeddedId
    CommentID id;

    private int Rate;
    private Date date;
    private String commenttext;


    @ManyToOne
    @JoinColumn (name = "ProductID", insertable = false, updatable = false)
    private Product product;

    //Add user here.

}
