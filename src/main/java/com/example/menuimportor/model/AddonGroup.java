// AddonGroup.java
package com.example.menuimportor.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Table(name = "addongroup")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddonGroup {
    @Id
    private String groupId;

    private String groupName;
    private int groupRank;
    private boolean active;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @OneToMany(mappedBy = "addonGroup", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AddonItem> addonItems = new ArrayList<>();
}