// File: OrderType.java
package com.example.menuimportor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_type")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderType {
    @Id
    private Integer ordertypeid;

    private String ordertype;
}
