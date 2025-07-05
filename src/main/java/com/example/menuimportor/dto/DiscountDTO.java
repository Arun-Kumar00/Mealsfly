package com.example.menuimportor.dto;

import lombok.Data;

@Data
public class DiscountDTO {
    private String discountid;
    private String discountname;
    private String discounttype;
    private String discount;
    private String discountordertype;
    private String discountapplicableon;
    private String discountdays;
    private String active;
    private String discountontotal;
    private String discountstarts;
    private String discountends;
    private String discounttimefrom;
    private String discounttimeto;
    private String discountminamount;
    private String discountmaxamount;
    private String discounthascoupon;
    private String discountcategoryitemids;
    private String discountmaxlimit;
}
