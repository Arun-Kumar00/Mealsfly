package com.example.menuimportor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
public class ItemMaster {
    @Id
    private String itemid;
    private String restid;
    private String catid;
    private String name;
    private String image;
    private boolean customize;
    private boolean isEnable;
}
