package com.example.menuimportor.dto;

import lombok.Data;

@Data
public class ItemUnitDTO {
    private Long item_unit_id;
    private String item_id;
    private String unit;
    private String price;
}