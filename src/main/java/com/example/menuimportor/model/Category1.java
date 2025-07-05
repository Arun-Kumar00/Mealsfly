package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "category1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category1 {

    @Id
    private String categoryId;

    private String categoryName;
    private String groupCategoryId;
    private String active;
    private String parentCategoryId;
    private String categoryRank;
}