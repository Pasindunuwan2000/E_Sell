package com.esell.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Customer extends User {

    private String address;
    private String phone;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;

    // Getters and Setters
}
