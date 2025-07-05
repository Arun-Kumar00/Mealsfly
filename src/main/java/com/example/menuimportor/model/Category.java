// Category.java
package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
  @Id
  private String categoryId;

  private String categoryName;
  private int categoryRank;
  private String parentCategoryId;
  private String categoryImageUrl;
  private String groupCategoryId;
  private String active;

  @ManyToOne
  @JoinColumn(name = "restaurant_id")
  private Restaurant restaurant;

  @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Item> items = new ArrayList<>();
}
