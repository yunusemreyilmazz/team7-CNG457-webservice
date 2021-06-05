package com.example.team7CNG457webservice.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "comment_id")
public class Comment {

    @Id
    @Column(name = "CommentID",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int comment_id;

    private int Rate;
    private Date date;
    private String commenttext;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn (name = "ProductID", insertable = false, updatable = false)
    private Product product;


}
