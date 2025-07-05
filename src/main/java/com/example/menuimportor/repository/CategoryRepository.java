package com.example.menuimportor.repository;

import com.example.menuimportor.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
