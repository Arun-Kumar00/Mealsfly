package com.example.menuimportor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "attribute")
@Data
public class Attribute {
    @Id
    private String attributeid;

    private String attribute;
    private String active;
}