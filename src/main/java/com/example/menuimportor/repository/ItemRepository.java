package com.example.menuimportor.repository;

import com.example.menuimportor.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, String> {
}
