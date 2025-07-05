package com.example.menuimportor.repository;

import com.example.menuimportor.model.RestaurantMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantMasterRepository extends JpaRepository<RestaurantMaster, String> {
}