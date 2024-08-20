package com.example.edpi.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MUserDto {
    
    @Column
    @Id
    private String userId;

    @Column
    private String pass;
}
