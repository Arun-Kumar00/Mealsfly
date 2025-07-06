package com.example.menuimportor.dto;

import lombok.Data;

@Data
public class RestaurantDTO {
    private String restaurantid;
    private String active;
    private String restaurantname;
    private String address;
    private String contact;
    private String latitude;
    private String longitude;
    private String mop;
}