package com.example.edpi.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer userId;

    @Column
    private String pass;

    @Column
    private Date created_at;

    @Column
    private Date updated_at;
}

/**
 * userId SERIAL NOT NULL PRIMARY KEY,
    pass VARCHAR(20) NOT NULL,
    created_at DATE,
    updated_at DATE
 */
