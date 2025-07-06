// package com.example.menuimportor.service;

// import com.example.menuimportor.dto.*;
// import com.example.menuimportor.model.*;
// import com.example.menuimportor.repository.*;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class PetpoojaService {

//     @Autowired
//     private RestaurantMasterRepository restaurantRepo;

//     @Autowired
//     private CategoryMasterRepository categoryRepo;

//     @Autowired
//     private ItemMasterRepository itemRepo;

//     @Autowired
//     private ItemUnit1Repository itemUnitRepo;

//     public void saveMenu(PetpoojaPushMenuDTO menuDTO) {

//         // Save Restaurants
//         if (menuDTO.getRestaurants() != null) {
//             for (RestaurantDTO r : menuDTO.getRestaurants()) {
//                 RestaurantMaster restaurant = new RestaurantMaster();
//                 restaurant.setRestaurantid(r.getRestaurantid());
//                 restaurant.setRestaurantname(r.getDetails().getRestaurantname());
//                 restaurant.setAddress(r.getDetails().getAddress());
//                 restaurant.setContact(r.getDetails().getContact());
//                 restaurant.setLatitude(r.getDetails().getLatitude());
//                 restaurant.setLongitude(r.getDetails().getLongitude());
//                 restaurant.setMop(r.getDetails().getSc_applicable_on());
//                 restaurant.setActive(r.getActive());
//                 restaurantRepo.save(restaurant);
//             }
//         }

//         // Save Categories
//         if (menuDTO.getCategories() != null) {
//             for (CategoryDTO c : menuDTO.getCategories()) {
//                 CategoryMaster category = new CategoryMaster();
//                 category.setCategoryid(c.getCategoryid());
//                 category.setCategoryname(c.getCategoryname());
//                 category.setActive(c.getActive());
//                 category.setRestaurantid(c.getRestaurantid()); // Can be null unless linked manually
//                 categoryRepo.save(category);
//             }
//         }

//         // Save Items and Item Units
//         if (menuDTO.getItems() != null) {
//             for (ItemDTO i : menuDTO.getItems()) {
//                 // Save item
//                 ItemMaster item = new ItemMaster();
//                 item.setItemid(i.getItemid());
//                 item.setItemname(i.getItemname());
//                 item.setCustomize(i.getPrice());
//                 item.setActive(i.getActive());
//                 item.setItem_categoryid(i.getItem_categoryid());
//                 item.setRestaurantid(i.getRestaurantid());
//                 itemRepo.save(item);

//                 // Save item units (variations)
//                 if (i.getVariation() != null) {
//                     for (ItemUnitDTO unitDTO : i.getVariation()) {
//                         ItemUnit1 unit = new ItemUnit1();
//                         unit.setItem_unit_id(unitDTO.getId());
//                         unit.setItem_id(i.getItemid());
//                         unit.setUnit(unitDTO.getName());
//                         unit.setPrice(unitDTO.getPrice());
//                         itemUnitRepo.save(unit);
//                     }
//                 }
//             }
//         }
//     }
// }
package com.example.menuimportor.service;

import com.example.menuimportor.dto.PetpoojaPushMenuDTO;
import com.example.menuimportor.dto.RestaurantDTO;
import com.example.menuimportor.dto.CategoryDTO;
import com.example.menuimportor.dto.ItemDTO;
import com.example.menuimportor.dto.ItemUnitDTO;
import com.example.menuimportor.model.RestaurantMaster;
import com.example.menuimportor.model.CategoryMaster;
import com.example.menuimportor.model.ItemMaster;
import com.example.menuimportor.model.ItemUnit1;
import com.example.menuimportor.repository.RestaurantMasterRepository;
import com.example.menuimportor.repository.CategoryMasterRepository;
import com.example.menuimportor.repository.ItemMasterRepository;
import com.example.menuimportor.repository.ItemUnit1Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PetpoojaService {

  @Autowired
  private RestaurantMasterRepository restaurantMasterRepository;

  @Autowired
  private CategoryMasterRepository categoryMasterRepository;

  @Autowired
  private ItemMasterRepository itemMasterRepository;

  @Autowired
  private ItemUnit1Repository itemUnitRepository;

  public void saveMenu(PetpoojaPushMenuDTO dto) {
    // Save Restaurants
    if (dto.getRestaurants() != null) {
      restaurantMasterRepository.saveAll(
          dto.getRestaurants().stream().map(r -> {
            RestaurantMaster restaurant = new RestaurantMaster();
            restaurant.setRestaurantid(r.getRestaurantid());
            restaurant.setRestaurantname(r.getDetails().getRestaurantname());
            restaurant.setAddress(r.getDetails().getAddress());
            restaurant.setContact(r.getDetails().getContact());
            restaurant.setLatitude(r.getDetails().getLatitude());
            restaurant.setLongitude(r.getDetails().getLongitude());
            restaurant.setMop("0");
            restaurant.setActive(r.getActive());
            return restaurant;
          }).collect(Collectors.toList()));
    }

    // Save Categories
    if (dto.getCategories() != null) {
      categoryMasterRepository.saveAll(
          dto.getCategories().stream().map(c -> {
            CategoryMaster category = new CategoryMaster();
            category.setCategoryid(c.getCategoryid());
            category.setCategoryname(c.getCategoryname());
            category.setActive(c.getActive());
            String restaurantid1 = dto.getRestaurants() != null && !dto.getRestaurants().isEmpty()
                ? dto.getRestaurants().get(0).getRestaurantid()
                : null;
            category.setRestid(restaurantid1);
            return category;
          }).collect(Collectors.toList()));
    }

    // Save Items
    if (dto.getItems() != null) {
      itemMasterRepository.saveAll(
          dto.getItems().stream().map(i -> {
            ItemMaster item = new ItemMaster();
            item.setItemid(i.getItemid());
            item.setItemname(i.getItemname());
            item.setCustomize("1");
            item.setActive(i.getActive());
            item.setCatid(i.getItem_categoryid());
            String restaurantid1 = dto.getRestaurants() != null && !dto.getRestaurants().isEmpty()
                ? dto.getRestaurants().get(0).getRestaurantid()
                : null;
            item.setRestid(restaurantid1);
            return item;
          }).collect(Collectors.toList()));
    }

    if (dto.getItems() != null) {
      List<ItemUnit1> itemUnits = new ArrayList<>();

      for (ItemDTO itemDTO : dto.getItems()) {
        if (itemDTO.getVariation() != null) {
          for (ItemUnitDTO variation : itemDTO.getVariation()) {
            ItemUnit1 unit = new ItemUnit1();
            unit.setItemid(variation.getItem_unit_id());
            unit.setId(itemDTO.getItemid()); // from parent item
            unit.setUnit(variation.getName());
            unit.setAmount(variation.getPrice());
            itemUnits.add(unit);
          }
        }
      }

      itemUnitRepository.saveAll(itemUnits);
    }
  }
}