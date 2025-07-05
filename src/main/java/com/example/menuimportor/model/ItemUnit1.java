package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "item_unit1")
@Data
public class ItemUnit1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String itemid;
    private String unit;
    private String amount;
}