package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    @Id
    private String itemId;

    private String itemName;
    private String itemDescription;
    private String itemImageUrl;
    private String itemPackingCharges;
    private String price; // ✅ Added this field
    private String active; // ✅ Use this as String to match service call (from "1", "0")

    // Add other fields as per your JSON/data like:
    private String itemAttributeId;
    private String itemRank;
    private String inStock;
    private String itemFavorite;

    // Optional: If you want to also have a boolean field for true/false logic
    // you can have both like this:
    // @Transient
    // private boolean isActiveBool;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category; // ✅ Required for setCategory(Category) to work

}
