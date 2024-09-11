package com.example.Week_2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Week_2.model.user;

@Service
public class userService<userRepository> {
    @Autowired
    private userRepository userRepository;

    public user registerUser(user user) {
        // Add any validation or business logic here
        return userRepository.save(user);
    }

    public user findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public boolean authenticateUser(String username, String password) {
        user user = userRepository.findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }
}