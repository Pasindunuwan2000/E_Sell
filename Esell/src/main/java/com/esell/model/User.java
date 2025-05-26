package com.esell.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(nullable = false, unique = true)
    protected String username;

    @Column(nullable = false)
    protected String password;

    @Column(nullable = false)
    protected String email;

    @Enumerated(EnumType.STRING)
    protected Role role;

    public enum Role {
        ADMIN,
        CUSTOMER,
        SELLER
    }

}
