package com.esell.model;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private double price;
    private int stock;

    @ManyToOne
    private Seller seller;

    // Getters and Setters
}
