package com.example.menuimportor.dto;

import lombok.Data;
import java.util.List;

@Data
public class ItemDTO {
    private String itemid;
    private String itemallowvariation;
    private String itemrank;
    private String item_categoryid;
    private String item_ordertype;
    private List<String> item_tags;
    private ItemInfoDTO item_info;
    private String item_packingcharges;
    private String itemallowaddon;
    private String itemaddonbasedon;
    private String item_favorite;
    private String ignore_taxes;
    private String ignore_discounts;
    private String in_stock;
    private List<String> cuisine;
    private String variation_groupname;
    private List<VariationDetailDTO> variation;
    private List<AddonMappingDTO> addon;
    private String is_recommend;
    private String itemname;
    private String item_attributeid;
    private String itemdescription;
    private String minimumpreparationtime;
    private String price;
    private String markup_price;
    private String active;
    private String item_image_url;
    private String item_tax;
    private boolean tax_inclusive;
    private String gst_type;
    private NutritionDTO nutrition;
    private String is_combo;
    private List<ComboItemDTO> combo_items;
}
