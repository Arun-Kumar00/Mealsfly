package com.example.menuimportor.dto;

import lombok.Data;
import java.util.List;

@Data
public class AddonGroupDTO {
    private String addongroupid;
    private String addongroup_rank;
    private String active;
    private List<AddonItemDTO> addongroupitems;
    private String addongroup_name;
}
