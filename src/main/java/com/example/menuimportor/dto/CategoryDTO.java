package com.example.menuimportor.dto;

import lombok.Data;

@Data
public class CategoryDTO {
    private String categoryid;
    private String active;
    private String categoryrank;
    private String parent_category_id;
    private String categoryname;
    private String categorytimings;
    private String category_image_url;
    private String group_category_id;
}
