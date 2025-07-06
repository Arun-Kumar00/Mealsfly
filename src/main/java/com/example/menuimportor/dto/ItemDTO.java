package com.example.menuimportor.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ItemDTO {
    private String itemid;
    private String itemname;
    private String customize;
    private String active;
    private String item_categoryid;
    private String restaurantid;
    @JsonProperty("variation")
    private List<ItemUnitDTO> variation;
}