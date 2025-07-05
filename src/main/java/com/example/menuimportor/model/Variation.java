// Variation.java
package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "variation")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Variation {
    @Id
    private String variationId;

    private String name;
    private String groupName;
    private double price;
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
}