package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "category_master")
@Data
public class CategoryMaster {

    @Id
    private String categoryid;

    private String categoryname;
    private String restaurantid;
    private String active;
}
