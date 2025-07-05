package com.example.menuimportor.repository;

import com.example.menuimportor.model.Variation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VariationRepository extends JpaRepository<Variation, String> {
}
