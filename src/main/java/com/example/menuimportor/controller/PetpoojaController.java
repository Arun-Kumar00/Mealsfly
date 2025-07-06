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
    public ResponseEntity<?> receivePushMenu(@RequestBody PetpoojaPushMenuDTO menuDTO) {
        try {
            petpoojaService.saveMenu(menuDTO);
            return ResponseEntity.ok()
                    .body("{\"Menu saved successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body(
                    "{\"message\":\"Error saving menu.\",\"http_code\":500,\"error\":\"" + e.getMessage() + "\"}");
        }
    }
}