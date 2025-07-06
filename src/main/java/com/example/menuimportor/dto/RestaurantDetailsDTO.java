package com.example.menuimportor.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RestaurantDetailsDTO {
    @JsonProperty("restaurantname")
    private String restaurantname;

    @JsonProperty("address")
    private String address;

    @JsonProperty("contact")
    private String contact;

    @JsonProperty("latitude")
    private String latitude;

    @JsonProperty("longitude")
    private String longitude;

    @JsonProperty("mop")
    private String mop;

}
