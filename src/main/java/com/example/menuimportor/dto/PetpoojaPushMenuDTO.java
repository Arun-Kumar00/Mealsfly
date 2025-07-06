package com.example.menuimportor.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PetpoojaPushMenuDTO {
    private List<RestaurantDTO> restaurants;
    private List<CategoryDTO> categories;
    private List<ItemDTO> items;
    private List<ItemUnitDTO> itemUnits; // This must be manually mapped from item.variation
}