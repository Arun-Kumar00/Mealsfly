package com.example.menuimportor.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RestaurantDTO {
    @JsonProperty("restaurantid")
    private String restaurantid;
    @JsonProperty("active")
    private String active;
    @JsonProperty("details")
    private RestaurantDetailsDTO details;
}