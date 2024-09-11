package com.example.Week_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Week_2.model.user;

public interface userRepository extends JpaRepository<user>{
    user findByUsername(String username);
}