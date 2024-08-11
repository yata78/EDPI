package com.example.edpi.Entity;
import org.hibernate.validator.constraints.Range;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "sensitivity")
public class Sensitivity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer sensitivityId;

    @Column
    private Integer userId;

    /**
     * valorantのゲーム内感度の最小値と最大値
     */
    @Column
    @Range(min = 0 , max = 10)
    private Integer sensitivityInGame;

    @Column
    @Range(min = 100)
    private Integer dpi;

}
