package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "nutrition")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nutrition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Simple fields
    private String servingInfo;

    @Embedded
    private Nutrient calories;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "protien_amount")),
            @AttributeOverride(name = "unit", column = @Column(name = "protien_unit"))
    })
    private Nutrient protien;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "sodium_amount")),
            @AttributeOverride(name = "unit", column = @Column(name = "sodium_unit"))
    })
    private Nutrient sodium;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "carbohydrate_amount")),
            @AttributeOverride(name = "unit", column = @Column(name = "carbohydrate_unit"))
    })
    private Nutrient carbohydrate;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "totalSugar_amount")),
            @AttributeOverride(name = "unit", column = @Column(name = "totalSugar_unit"))
    })
    private Nutrient totalSugar;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "addedSugar_amount")),
            @AttributeOverride(name = "unit", column = @Column(name = "addedSugar_unit"))
    })
    private Nutrient addedSugar;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "fiber_amount")),
            @AttributeOverride(name = "unit", column = @Column(name = "fiber_unit"))
    })
    private Nutrient fiber;

    // Add others like cholesterol, fat, etc., similarly as needed
}