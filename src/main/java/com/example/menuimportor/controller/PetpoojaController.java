// package com.example.menuimportor.controller;

// import com.example.menuimportor.dto.PetpoojaPushMenuDTO;
// import com.example.menuimportor.service.PetpoojaService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api/petpooja")
// public class PetpoojaController {

//     @Autowired
//     private PetpoojaService petpoojaService;

//     @PostMapping("/pushmenu")
//     public ResponseEntity<String> receiveMenu(@RequestBody PetpoojaPushMenuDTO menuDTO) {
//         try {
//             petpoojaService.saveMenu(menuDTO);
//             return ResponseEntity.ok("Menu saved successfully.");
//         } catch (Exception e) {
//             return ResponseEntity.badRequest().body("Failed to save menu: " + e.getMessage());
//         }
//     }
// }
package com.example.menuimportor.controller;

import com.example.menuimportor.dto.PetpoojaPushMenuDTO;
import com.example.menuimportor.service.PetpoojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PetpoojaController {

    @Autowired
    private PetpoojaService petpoojaService;

    @PostMapping("/pushmenu")
    public ResponseEntity<String> pushMenu(@RequestBody PetpoojaPushMenuDTO menuDTO) {
        try {
            petpoojaService.saveMenu(menuDTO);
            return ResponseEntity.ok("Menu saved successfully");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Failed to save menu: " + e.getMessage());
        }
    }
}