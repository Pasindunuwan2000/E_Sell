package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.CategoryRepo;
import com.example.demo.model.Category;

@Service
public class CategoryService {
	@Autowired private CategoryRepo categoryRepo;
	
    public List<Category> getAll() { 
    	return categoryRepo.findAll(); 
    }
}