package com.esell.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime orderDate;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<Product> products;

    // Getters and Setters
}
