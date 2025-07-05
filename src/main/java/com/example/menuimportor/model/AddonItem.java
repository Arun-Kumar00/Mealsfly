// AddonItem.java
package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "addonitem")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddonItem {
    @Id
    private String addonItemId;

    private String addonItemName;
    private double addonItemPrice;
    private boolean active;
    private int addonItemRank;

    @ManyToOne
    @JoinColumn(name = "addongroup_id")
    private AddonGroup addonGroup;
}