package com.example.menuimportor.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ItemUnitDTO {
    @JsonProperty("variationid")
    private String item_unit_id;
    private String item_id;
    private String name;
    private String price;
}