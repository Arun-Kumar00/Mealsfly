package com.example.menuimportor.dto;

import lombok.Data;
import java.util.List;

@Data
public class RestaurantDetailsDTO {
    private String menusharingcode;
    private String currency_html;
    private String country;
    private List<String> images;
    private String restaurantname;
    private String address;
    private String contact;
    private String latitude;
    private String longitude;
    private String city;
    private String state;
    private String minimumorderamount;
    private String minimumdeliverytime;
    private String minimum_prep_time;
    private String deliverycharge;
    private String deliveryhoursfrom1;
    private String deliveryhoursto1;
    private String deliveryhoursfrom2;
    private String deliveryhoursto2;
    private String sc_applicable_on;
    private String sc_type;
    private String sc_calculate_on;
    private String sc_value;
    private String tax_on_sc;
    private int calculatetaxonpacking;
    private String pc_taxes_id;
    private int calculatetaxondelivery;
    private String dc_taxes_id;
    private String packaging_applicable_on;
    private String packaging_charge;
    private String packaging_charge_type;
}
