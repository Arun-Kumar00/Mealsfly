package com.example.menuimportor.repository;

import com.example.menuimportor.model.OrderType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTypeRepository extends JpaRepository<OrderType, Integer> {
}
