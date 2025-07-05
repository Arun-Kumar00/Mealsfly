package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "restaurant1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant1 {

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
}