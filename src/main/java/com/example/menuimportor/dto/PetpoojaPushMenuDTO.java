package com.example.menuimportor.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PetpoojaPushMenuDTO {

    private List<RestaurantDTO> restaurants;
    private List<CategoryDTO> categories;
    private List<ItemDTO> items;
    private List<ItemUnitDTO> itemunits;

    public List<RestaurantDTO> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<RestaurantDTO> restaurants) {
        this.restaurants = restaurants;
    }

    public List<CategoryDTO> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryDTO> categories) {
        this.categories = categories;
    }

    public List<ItemDTO> getItems() {
        return items;
    }

    public void setItems(List<ItemDTO> items) {
        this.items = items;
    }

    public List<ItemUnitDTO> getItemunits() {
        return itemunits;
    }

    public void setItemunits(List<ItemUnitDTO> itemunits) {
        this.itemunits = itemunits;
    }
}
