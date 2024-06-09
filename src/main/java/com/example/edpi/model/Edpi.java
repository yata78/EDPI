package com.example.edpi.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Edpis")
public class Edpi {
    
    @Id
    @Column(name = "userid")
    private Integer UserId;

    @Column(nullable = false)
    private Integer Dpi;

    @Column(nullable = false)
    private float Sensitivity;

    @Column(nullable = false)
    private Date Created_At;
}