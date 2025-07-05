package com.example.menuimportor.dto;

import lombok.Data;

@Data
public class RestaurantDTO {
    private String restaurantid;
    private String active;
    private RestaurantDetailsDTO details;
}
