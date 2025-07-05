package com.example.menuimportor.repository;

import com.example.menuimportor.model.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaxRepository extends JpaRepository<Tax, String> {
}
