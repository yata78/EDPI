package com.example.edpi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.edpi.Entity.MUser;

public interface LoginRepository extends JpaRepository<MUser, Integer>{
    
}
