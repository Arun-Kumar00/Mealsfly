package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "item_master")
@Data
public class ItemMaster {

    @Id
    private String itemid;

    private String itemname;
    private String catid;
    private String restid;
    private Boolean active;
    private String customize;

}