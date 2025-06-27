package com.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.UserRepository;
import com.example.demo.model.User;

@Service
public class UserServices {
    @Autowired private UserRepository userRepo;

    public String register(User user) {
        if (userRepo.findByEmail(user.getEmail()).isPresent())
            return "Email already registered";
        userRepo.save(user);
        return "User registered successfully";
    }

    public Optional<User> login(String email, String password) {
        Optional<User> user = userRepo.findByEmail(email);
        return (user.isPresent() && user.get().getPassword().equals(password)) ? user : Optional.empty();
    }

    public Optional<User> getProfile(Long id) {
        return userRepo.findById(id);
    }

    public void updateProfile(User user) {
        userRepo.save(user);
    }
}