package com.example.menuimportor.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class PetpoojaMenuResponse {
    private List<Map<String, Object>> data;
}
