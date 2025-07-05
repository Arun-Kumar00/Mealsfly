package com.example.menuimportor.dto;

import lombok.Data;
import java.util.List;
import java.util.Map;

@Data
public class NutritionDTO {
    private FoodAmountDTO foodAmount;
    private NutritionAmountDTO calories;
    private NutritionAmountDTO protien;
    private List<MineralDTO> minerals;
    private NutritionAmountDTO sodium;
    private NutritionAmountDTO carbohydrate;
    private NutritionAmountDTO totalSugar;
    private NutritionAmountDTO addedSugar;
    private NutritionAmountDTO totalFat;
    private NutritionAmountDTO saturatedFat;
    private NutritionAmountDTO transFat;
    private NutritionAmountDTO cholesterol;
    private List<VitaminDTO> vitamins;
    private AdditionalInfoDTO additionalInfo;
    private NutritionAmountDTO fiber;
    private String servingInfo;
    private Map<String, NutritionAmountDTO> additiveMap;
    private List<AllergenDTO> allergens;
}
