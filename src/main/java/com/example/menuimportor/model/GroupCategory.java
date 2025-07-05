package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "group_categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupCategory {

    @Id
    private String id;

    private String name;

    private String status;

    @Column(name = "`rank`")
    private String rank;

}
