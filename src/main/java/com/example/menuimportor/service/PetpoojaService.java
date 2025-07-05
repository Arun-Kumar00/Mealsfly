package com.example.menuimportor.service;

import com.example.menuimportor.dto.*;
import com.example.menuimportor.model.*;
import com.example.menuimportor.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetpoojaService {

  @Autowired
  private RestaurantMasterRepository restaurantRepo;

  @Autowired
  private CategoryMasterRepository categoryRepo;

  @Autowired
  private ItemMasterRepository itemRepo;

  @Autowired
  private ItemUnit1Repository itemUnitRepo;

  public void saveMenu(PetpoojaPushMenuDTO menuDTO) {
    try {
      // Save Restaurants
      if (menuDTO.getRestaurants() != null) {
        for (RestaurantDTO dto : menuDTO.getRestaurants()) {
          if (dto != null) {
            RestaurantMaster restaurant = new RestaurantMaster();
            restaurant.setRestaurantid(dto.getRestaurantid());
            restaurant.setActive(dto.getActive());
            restaurant.setRestaurantname(dto.getRestaurantname());
            restaurant.setAddress(dto.getAddress());
            restaurant.setContact(dto.getContact());
            restaurant.setLatitude(dto.getLatitude());
            restaurant.setLongitude(dto.getLongitude());
            restaurant.setMop(dto.getMop());

            restaurantRepo.save(restaurant);
          }
        }
      }

      // Save Categories
      if (menuDTO.getCategories() != null) {
        for (CategoryDTO dto : menuDTO.getCategories()) {
          if (dto != null) {
            CategoryMaster category = new CategoryMaster();
            category.setCategoryid(dto.getCategoryid());
            category.setCategoryname(dto.getCategoryname());
            category.setActive(dto.getActive());
            category.setRestid(dto.getRestid());

            categoryRepo.save(category);
          }
        }
      }

      // Save Items
      if (menuDTO.getItems() != null) {
        for (ItemDTO dto : menuDTO.getItems()) {
          if (dto != null) {
            ItemMaster item = new ItemMaster();
            item.setItemid(dto.getItemid());
            item.setItemname(dto.getItemname());
            item.setCustomize(dto.getCustomize());
            item.setActive(dto.getActive());
            item.setCatid(dto.getItem_categoryid());
            item.setRestid(dto.getRestaurantid());

            itemRepo.save(item);
          }
        }
      }

      // Save Item Units
      if (menuDTO.getItemunits() != null) {
        for (ItemUnitDTO dto : menuDTO.getItemunits()) {
          if (dto != null) {
            ItemUnit1 unit = new ItemUnit1();
            unit.setId(dto.getItem_unit_id());
            unit.setItemid(dto.getItem_id());
            unit.setUnit(dto.getUnit());
            unit.setAmount(dto.getPrice());

            itemUnitRepo.save(unit);
          }
        }
      }

    } catch (Exception e) {
      throw new RuntimeException("Failed to save menu: " + e.getMessage(), e);
    }
  }
}