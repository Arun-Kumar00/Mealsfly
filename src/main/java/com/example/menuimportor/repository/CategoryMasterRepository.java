package com.example.menuimportor.repository;

import com.example.menuimportor.model.CategoryMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryMasterRepository extends JpaRepository<CategoryMaster, String> {
}