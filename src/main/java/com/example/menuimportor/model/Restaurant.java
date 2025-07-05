// Restaurant.java
package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "restaurant")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    @Id
    private String restaurantId;

    private String restaurantName;
    private String address;
    private String contact;
    private String latitude;
    private String longitude;
    private String city;
    private String state;
    private String country;
    private String menuSharingCode;
    private String currencyHtml;
    private double minimumOrderAmount;
    private double deliveryCharge;
    private double packagingCharge;
    private String minimumDeliveryTime;
    private Boolean active;

    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Category> categories = new ArrayList<>();
}
