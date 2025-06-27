package com.example.demo.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.ProductRepo;
import com.example.demo.model.Product;

@Service
public class ProductService {
    @Autowired private ProductRepo productRepo;

    public List<Product> getAll() {
        return productRepo.findAll();
    }

    public List<Product> search(String keyword) {
        return productRepo.findByNameContainingIgnoreCase(keyword);
    }

    public List<Product> filterByCategory(Long categoryId) {
        return productRepo.findByCategoryId(categoryId);
    }
}
