package com.esell.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Seller extends User {

    private String shopName;
    private String shopAddress;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
    private List<Product> products;

    // Getters and Setters
}
