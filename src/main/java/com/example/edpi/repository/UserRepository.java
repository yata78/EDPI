package com.example.edpi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.edpi.model.User;

public interface UserRepository extends JpaRepository<User,Integer> {

}