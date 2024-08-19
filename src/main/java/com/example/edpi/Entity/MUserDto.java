package com.example.edpi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MUserDto {
    
    @Column
    @Id
    private Integer userId;

    @Column
    private String pass;
}
