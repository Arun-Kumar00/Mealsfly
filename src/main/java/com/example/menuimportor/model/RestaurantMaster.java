package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "restaurant_master")
@Data
public class RestaurantMaster {

    @Id
    private String restaurantid;

    private String restaurantname;
    private String address;
    private String contact;
    private String MOP;
    private String active;
    private String latitude;
    private String longitude;
}