package com.example.menuimportor.repository;

import com.example.menuimportor.model.ItemMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemMasterRepository extends JpaRepository<ItemMaster, String> {
}