package com.example.menuimportor.dto;

import lombok.Data;

@Data
public class CategoryDTO {
    private String categoryid;
    private String categoryname;
    private Boolean active;
    private String restid;
}