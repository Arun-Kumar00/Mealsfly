package com.example.menuimportor.dto;

import java.util.List;

import lombok.Data;

@Data
public class VariationDetailDTO {
    private String id;
    private String variationid;
    private String name;
    private String groupname;
    private String price;
    private String markup_price;
    private String active;
    private String item_packingcharges;
    private String variationrank;
    private List<Object> addon;
    private int variationallowaddon;
}
