package com.example.menuimportor.dto;

import lombok.Data;

@Data
public class ComboItemDTO {
    private String item_id;
    private String is_variation;
    private String variation_item_id;
    private String name;
    private String quantity;
}
