package com.example.menuimportor.dto;

import lombok.Data;
import java.util.List;

@Data
public class PushMenuRequestDTO {
    private String success;
    private List<RestaurantDTO> restaurants;
    private List<OrderTypeDTO> ordertypes;
    private List<CategoryDTO> categories;
    private List<GroupCategoryDTO> group_categories;
    private List<ItemDTO> items;
    private List<VariationDTO> variations;
    private List<AddonGroupDTO> addongroups;
    private List<AttributeDTO> attributes;
    private List<DiscountDTO> discounts;
    private List<TaxDTO> taxes;
}
