package nxrgrp.lia_inventory_crud_app.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/equipment")
public class EquipmentController {

        @GetMapping
        public String getEquipmentList() {
            return "Hello Equipment";
        }
    }
