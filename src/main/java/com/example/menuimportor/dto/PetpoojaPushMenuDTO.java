// package com.example.menuimportor.dto;

// import lombok.Data;

// import java.util.List;
// import java.util.Map;

// @Data
// public class PetpoojaMenuDTO {
//     private String success;
//     private List<RestaurantData> restaurants;
//     private List<OrderType> ordertypes;
//     private List<CategoryData> categories;
//     private List<GroupCategory> group_categories;
//     private List<ItemData> items;
//     private List<VariationData> variations;
//     private List<AddonGroup> addongroups;
//     private List<AttributeData> attributes;
//     private List<DiscountData> discounts;
//     private List<TaxData> taxes;
//     private String serverdatetime;
//     private String db_version;
//     private String application_version;
//     private int http_code;

//     @Data
//     public static class RestaurantData {
//         private String restaurantid;
//         private String active;
//         private RestaurantDetails details;
//     }

//     @Data
//     public static class RestaurantDetails {
//         private String menusharingcode;
//         private String currency_html;
//         private String country;
//         private List<String> images;
//         private String restaurantname;
//         private String address;
//         private String contact;
//         private String latitude;
//         private String longitude;
//         private String landmark;
//         private String city;
//         private String state;
//         private String minimumorderamount;
//         private String minimumdeliverytime;
//         private String minimum_prep_time;
//         private String deliverycharge;
//         private String deliveryhoursfrom1;
//         private String deliveryhoursto1;
//         private String deliveryhoursfrom2;
//         private String deliveryhoursto2;
//         private String sc_applicable_on;
//         private String sc_type;
//         private String sc_calculate_on;
//         private String sc_value;
//         private String tax_on_sc;
//         private int calculatetaxonpacking;
//         private String pc_taxes_id;
//         private int calculatetaxondelivery;
//         private String dc_taxes_id;
//         private String packaging_applicable_on;
//         private String packaging_charge;
//         private String packaging_charge_type;
//     }

//     @Data
//     public static class OrderType {
//         private int ordertypeid;
//         private String ordertype;
//     }

//     @Data
//     public static class CategoryData {
//         private String categoryid;
//         private String active;
//         private String categoryrank;
//         private String parent_category_id;
//         private String categoryname;
//         private String categorytimings;
//         private String category_image_url;
//         private String group_category_id;
//     }

//     @Data
//     public static class GroupCategory {
//         private String id;
//         private String name;
//         private String status;
//         private String rank;
//     }

//     @Data
//     public static class ItemData {
//         private String itemid;
//         private String itemallowvariation;
//         private String itemrank;
//         private String item_categoryid;
//         private String item_ordertype;
//         private List<String> item_tags;
//         private ItemInfo item_info;
//         private String item_packingcharges;
//         private String itemallowaddon;
//         private String itemaddonbasedon;
//         private String item_favorite;
//         private String ignore_taxes;
//         private String ignore_discounts;
//         private String in_stock;
//         private List<String> cuisine;
//         private String variation_groupname;
//         private List<Variation> variation;
//         private List<Addon> addon;
//         private String is_combo;
//         private List<ComboItem> combo_items;
//         private String is_recommend;
//         private String itemname;
//         private String item_attributeid;
//         private String itemdescription;
//         private String minimumpreparationtime;
//         private String price;
//         private String markup_price;
//         private String active;
//         private String item_image_url;
//         private boolean tax_inclusive;
//         private String item_tax;
//         private String gst_type;
//         private Nutrition nutrition;
//     }

//     @Data
//     public static class ItemInfo {
//         private String spice_level;
//     }

//     @Data
//     public static class Addon {
//         private String addon_group_id;
//         private String addon_item_selection_min;
//         private String addon_item_selection_max;
//     }

//     @Data
//     public static class ComboItem {
//         private String item_id;
//         private String is_variation;
//         private String variation_item_id;
//         private String name;
//         private String quantity;
//     }

//     @Data
//     public static class Nutrition {
//         private Map<String, NutritionAmount> additiveMap;
//         private List<Allergen> allergens;
//         private NutritionAmount foodAmount;
//         private NutritionAmount calories;
//         private NutritionAmount protien;
//         private List<Mineral> minerals;
//         private NutritionAmount sodium;
//         private NutritionAmount carbohydrate;
//         private NutritionAmount totalSugar;
//         private NutritionAmount addedSugar;
//         private NutritionAmount totalFat;
//         private NutritionAmount saturatedFat;
//         private NutritionAmount transFat;
//         private NutritionAmount cholesterol;
//         private List<Vitamin> vitamins;
//         private AdditionalInfo additionalInfo;
//         private NutritionAmount fiber;
//         private String servingInfo;
//     }

//     @Data
//     public static class NutritionAmount {
//         private double amount;
//         private String unit;
//     }

//     @Data
//     public static class Allergen {
//         private String allergen;
//         private String allergenDesc;
//     }

//     @Data
//     public static class Mineral {
//         private String name;
//         private double amount;
//         private String unit;
//     }

//     @Data
//     public static class Vitamin {
//         private String name;
//         private double amount;
//         private String unit;
//     }

//     @Data
//     public static class AdditionalInfo {
//         private String info;
//         private String remark;
//     }

//     @Data
//     public static class Variation {
//         private String id;
//         private String variationid;
//         private String name;
//         private String groupname;
//         private String price;
//         private String markup_price;
//         private String active;
//         private String item_packingcharges;
//         private String variationrank;
//         private List<Addon> addon;
//         private int variationallowaddon;
//     }

//     @Data
//     public static class VariationData {
//         private String variationid;
//         private String name;
//         private String groupname;
//         private String status;
//     }

//     @Data
//     public static class AddonGroup {
//         private String addongroupid;
//         private String addongroup_rank;
//         private String active;
//         private String addongroup_name;
//         private List<AddonItem> addongroupitems;
//     }

//     @Data
//     public static class AddonItem {
//         private String addonitemid;
//         private String addonitem_name;
//         private String addonitem_price;
//         private String active;
//         private String attributes;
//         private String addonitem_rank;
//     }

//     @Data
//     public static class AttributeData {
//         private String attributeid;
//         private String attribute;
//         private String active;
//     }

//     @Data
//     public static class DiscountData {
//         private String discountid;
//         private String discountname;
//         private String discounttype;
//         private String discount;
//         private String discountordertype;
//         private String discountapplicableon;
//         private String discountdays;
//         private String active;
//         private String discountontotal;
//         private String discountstarts;
//         private String discountends;
//         private String discounttimefrom;
//         private String discounttimeto;
//         private String discountminamount;
//         private String discountmaxamount;
//         private String discounthascoupon;
//         private String discountcategoryitemids;
//         private String discountmaxlimit;
//     }

//     @Data
//     public static class TaxData {
//         private String taxid;
//         private String taxname;
//         private String tax;
//         private String taxtype;
//         private String tax_ordertype;
//         private String active;
//         private String tax_coreortotal;
//         private String tax_taxtype;
//         private String rank;
//         private String consider_in_core_amount;
//         private String description;
//     }
// }
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

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RestaurantDTO {
        private String restaurantid;
        private String active;
        private DetailsDTO details;

        @Data
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class DetailsDTO {
            private String menusharingcode;
            private String currency_html;
            private String country;
            private String restaurantname;
            private String address;
            private String contact;
            private String latitude;
            private String longitude;
            private String landmark;
            private String city;
            private String state;
            private String minimumorderamount;
            private String minimumdeliverytime;
            private String minimum_prep_time;
            private String deliverycharge;
            private String packaging_charge;
            private String packaging_charge_type;
        }
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CategoryDTO {
        private String categoryid;
        private String active;
        private String categoryrank;
        private String parent_category_id;
        private String categoryname;
        private String group_category_id;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ItemDTO {
        private String itemid;
        private String itemname;
        private String price;
        private String item_categoryid;
        private String active;
    }
}