package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Discount {
    @Id
    private String discountid;

    private String discountname;
    private String discounttype;
    private String discount;
    private String discountordertype;
    private String discountapplicableon;
    private String discountdays;
    private String active;
    private String discountontotal;
    private String discountcategoryitemids;
}
