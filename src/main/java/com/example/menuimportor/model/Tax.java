package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "tax_info")
@NoArgsConstructor
@AllArgsConstructor
public class Tax {
    @Id
    private String taxid;
    private String taxname;
    private String tax;
    private String taxtype;
    private String tax_ordertype;
    private String active;
    private String tax_coreortotal;
    private String tax_taxtype;
    @Column(name = "`rank`")
    private String rank;
    private String considerInCoreAmount;
    private String description;
}
