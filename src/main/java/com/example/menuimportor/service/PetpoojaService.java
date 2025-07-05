// package com.example.menuimportor.service;

// import com.example.menuimportor.dto.PetpoojaMenuDTO;
// import com.example.menuimportor.model.*;
// import com.example.menuimportor.repository.*;
// import jakarta.transaction.Transactional;
// import lombok.RequiredArgsConstructor;
// import org.springframework.stereotype.Service;

// import java.util.stream.Collectors;

// @Service
// @RequiredArgsConstructor
// public class PetpoojaService {

//   private final RestaurantRepository restaurantRepository;
//   private final CategoryRepository categoryRepository;
//   private final ItemRepository itemRepository;
//   private final GroupCategoryRepository groupCategoryRepository;
//   private final OrderTypeRepository orderTypeRepository;
//   private final AttributeRepository attributeRepository;
//   private final DiscountRepository discountRepository;
//   private final TaxRepository taxInfoRepository;
//   private final AddonGroupRepository addonGroupRepository;
//   private final AddonItemRepository addonItemRepository;

//   @Transactional
//   public void saveMenu(PetpoojaMenuDTO dto) {
//     try {
//       // 1. Save Restaurants
//       dto.getRestaurants().forEach(r -> {
//         Restaurant restaurant = new Restaurant();
//         restaurant.setRestaurantId(r.getRestaurantid());
//         restaurant.setRestaurantName(r.getDetails().getRestaurantname());
//         restaurant.setAddress(r.getDetails().getAddress());
//         restaurant.setContact(r.getDetails().getContact());
//         restaurant.setLatitude(r.getDetails().getLatitude());
//         restaurant.setLongitude(r.getDetails().getLongitude());
//         restaurant.setCity(r.getDetails().getCity());
//         restaurant.setState(r.getDetails().getState());
//         restaurant.setCountry(r.getDetails().getCountry());
//         restaurant.setMenuSharingCode(r.getDetails().getMenusharingcode());
//         restaurant.setCurrencyHtml(r.getDetails().getCurrency_html());
//         restaurant.setMinimumOrderAmount(Double.parseDouble(r.getDetails().getMinimumorderamount()));
//         restaurant.setDeliveryCharge(Double.parseDouble(r.getDetails().getDeliverycharge()));
//         restaurant.setPackagingCharge(Double.parseDouble(r.getDetails().getPackaging_charge()));
//         restaurant.setMinimumDeliveryTime(r.getDetails().getMinimumdeliverytime());

//         restaurantRepository.save(restaurant);
//       });

//       // 2. Save Group Categories
//       dto.getGroup_categories().forEach(gc -> {
//         GroupCategory groupCategory = new GroupCategory();
//         groupCategory.setId(gc.getId());
//         groupCategory.setName(gc.getName());
//         groupCategory.setStatus(gc.getStatus());
//         groupCategory.setRank(gc.getRank());
//         groupCategoryRepository.save(groupCategory);
//       });

//       // 3. Save Categories
//       dto.getCategories().forEach(c -> {
//         Category category = new Category();
//         category.setCategoryId(c.getCategoryid());
//         category.setCategoryName(c.getCategoryname());
//         category.setActive(c.getActive());
//         category.setGroupCategoryId(c.getGroup_category_id());
//         categoryRepository.save(category);
//       });

//       // 4. Save Items
//       dto.getItems().forEach(i -> {
//         Item item = new Item();
//         item.setItemId(i.getItemid());
//         item.setItemName(i.getItemname());
//         item.setPrice(i.getPrice());
//         item.setActive(i.getActive());
//         item.setCategory(categoryRepository.findById(i.getItem_categoryid()).orElse(null));
//         item.setItemDescription(i.getItemdescription());

//         // Nutrition
//         if (i.getNutrition() != null) {
//           Nutrition nutrition = new Nutrition();
//           // nutrition.setCalories(i.getNutrition().getCalories());
//           // nutrition.setProtien(i.getNutrition().getProtien());
//           // nutrition.setSodium(i.getNutrition().getSodium());
//           nutrition.setServingInfo(i.getNutrition().getServingInfo());
//           // nutrition.setCarbohydrate(i.getNutrition().getCarbohydrate());
//           // nutrition.setAddedSugar(i.getNutrition().getAddedSugar());
//           // nutrition.setTotalSugar(i.getNutrition().getTotalSugar());
//           // item.setNutrition(nutrition);
//         }

//         itemRepository.save(item);
//       });

//       // 5. Save Order Types
//       dto.getOrdertypes().forEach(ot -> {
//         OrderType orderType = new OrderType();
//         orderType.setOrdertypeid(ot.getOrdertypeid());
//         orderType.setOrdertype(ot.getOrdertype());
//         orderTypeRepository.save(orderType);
//       });

//       // 6. Save Attributes
//       dto.getAttributes().forEach(a -> {
//         Attribute attribute = new Attribute();
//         attribute.setAttributeid(a.getAttributeid());
//         attribute.setAttribute(a.getAttribute());
//         attribute.setActive(a.getActive());
//         attributeRepository.save(attribute);
//       });

//       // 7. Save Discounts
//       dto.getDiscounts().forEach(d -> {
//         Discount discount = new Discount();
//         discount.setDiscountid(d.getDiscountid());
//         discount.setDiscountname(d.getDiscountname());
//         discount.setDiscounttype(d.getDiscounttype());
//         discount.setDiscount(d.getDiscount());
//         discount.setDiscountordertype(d.getDiscountordertype());
//         discount.setDiscountapplicableon(d.getDiscountapplicableon());
//         discount.setDiscountdays(d.getDiscountdays());
//         discount.setActive(d.getActive());
//         discountRepository.save(discount);
//       });

//       // 8. Save Taxes
//       dto.getTaxes().forEach(t -> {
//         Tax tax = new Tax();
//         tax.setTaxid(t.getTaxid());
//         tax.setTaxname(t.getTaxname());
//         tax.setTax(t.getTax());
//         tax.setTaxtype(t.getTaxtype());
//         tax.setActive(t.getActive());
//         tax.setRank(t.getRank());
//         tax.setTax_ordertype(t.getTax_ordertype());
//         tax.setTax_coreortotal(t.getTax_coreortotal());
//         tax.setTax_taxtype(t.getTax_taxtype());
//         tax.setConsiderInCoreAmount(t.getConsider_in_core_amount());
//         tax.setDescription(t.getDescription());
//         taxInfoRepository.save(tax);
//       });

//       // 9. Save Addon Groups & Items
//       dto.getAddongroups().forEach(ag -> {
//         AddonGroup addonGroup = new AddonGroup();
//         addonGroup.setGroupId(ag.getAddongroupid());
//         addonGroup.setGroupName(ag.getAddongroup_name());
//         addonGroup.setGroupRank(0);
//         addonGroup.setActive(false);
//         addonGroupRepository.save(addonGroup);

//         ag.getAddongroupitems().forEach(ai -> {
//           AddonItem addonItem = new AddonItem();
//           addonItem.setAddonItemId(ai.getAddonitemid());
//           addonItem.setAddonItemName(ai.getAddonitem_name());
//           addonItem.setAddonItemPrice(0);
//           addonItem.setAddonItemRank(0);
//           addonItem.setActive(false);
//           addonItem.setAddonGroup(addonGroup);
//           addonItemRepository.save(addonItem);
//         });
//       });

//     } catch (Exception e) {
//       throw new RuntimeException("Failed to save menu: " + e.getMessage(), e);
//     }
//   }
// }
package com.example.menuimportor.service;

import com.example.menuimportor.dto.PetpoojaPushMenuDTO;
import com.example.menuimportor.model.Category1;
import com.example.menuimportor.model.Item1;
import com.example.menuimportor.model.Restaurant1;
import com.example.menuimportor.repository.Category1Repository;
import com.example.menuimportor.repository.Item1Repository;
import com.example.menuimportor.repository.Restaurant1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class PetpoojaService {

  @Autowired
  private Restaurant1Repository restaurant1Repository;

  @Autowired
  private Category1Repository category1Repository;

  @Autowired
  private Item1Repository item1Repository;

  public void saveMenu(PetpoojaPushMenuDTO dto) {
    // Save Restaurants
    if (dto.getRestaurants() != null) {
      restaurant1Repository.saveAll(
          dto.getRestaurants().stream().map(r -> {
            Restaurant1 restaurant = new Restaurant1();
            restaurant.setRestaurantId(r.getRestaurantid());
            restaurant.setRestaurantName(r.getDetails().getRestaurantname());
            restaurant.setAddress(r.getDetails().getAddress());
            restaurant.setContact(r.getDetails().getContact());
            restaurant.setLatitude(r.getDetails().getLatitude());
            restaurant.setLongitude(r.getDetails().getLongitude());
            restaurant.setCity(r.getDetails().getCity());
            restaurant.setState(r.getDetails().getState());
            restaurant.setCountry(r.getDetails().getCountry());
            restaurant.setMenuSharingCode(r.getDetails().getMenusharingcode());
            restaurant.setCurrencyHtml(r.getDetails().getCurrency_html());
            restaurant.setMinimumOrderAmount(parseDoubleSafe(r.getDetails().getMinimumorderamount()));
            restaurant.setDeliveryCharge(parseDoubleSafe(r.getDetails().getDeliverycharge()));
            restaurant.setPackagingCharge(parseDoubleSafe(r.getDetails().getPackaging_charge()));
            restaurant.setMinimumDeliveryTime(r.getDetails().getMinimumdeliverytime());
            return restaurant;
          }).collect(Collectors.toList()));
    }

    // Save Categories
    if (dto.getCategories() != null) {
      category1Repository.saveAll(
          dto.getCategories().stream().map(c -> {
            Category1 category = new Category1();
            category.setCategoryId(c.getCategoryid());
            category.setCategoryName(c.getCategoryname());
            category.setGroupCategoryId(c.getGroup_category_id());
            category.setActive(c.getActive());
            category.setParentCategoryId(c.getParent_category_id());
            category.setCategoryRank(c.getCategoryrank());
            return category;
          }).collect(Collectors.toList()));
    }

    // Save Items
    if (dto.getItems() != null) {
      item1Repository.saveAll(
          dto.getItems().stream().map(i -> {
            Item1 item = new Item1();
            item.setItemId(i.getItemid());
            item.setItemName(i.getItemname());
            item.setPrice(i.getPrice());
            item.setCategoryId(i.getItem_categoryid());
            item.setActive(i.getActive());
            return item;
          }).collect(Collectors.toList()));
    }
  }

  private double parseDoubleSafe(String value) {
    try {
      return value != null ? Double.parseDouble(value) : 0.0;
    } catch (NumberFormatException e) {
      return 0.0;
    }
  }
}