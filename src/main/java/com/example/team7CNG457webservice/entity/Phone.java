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
@Table (name = "Phones")
public class Phone {
    @Id
    @Column (name = "phoneID", nullable = false)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int PhoneID;

    private int internalMemory;

    




    @ManyToOne
    @JoinColumn (name = "ProductID", insertable = false, updatable = false)
    private Product product;
}
