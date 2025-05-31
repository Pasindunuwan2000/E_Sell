package com.esell.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {
	@Id
	Long id;
	  String name;
	  String description;
}
