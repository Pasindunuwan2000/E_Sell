package com.esell.Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Product {

    @Id
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private Integer quantity;
    private String category;
    private String imageUrl;
    private Boolean isActive;
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "product")
    private List<CartItem> cartItems;

    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItems;
}

