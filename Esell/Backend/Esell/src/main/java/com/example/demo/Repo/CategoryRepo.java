package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {
	
}
