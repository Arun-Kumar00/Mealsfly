package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "item1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item1 {

    @Id
    private String itemId;

    private String itemName;
    private String price;
    private String categoryId;
    private String active;
}