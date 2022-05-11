package nxrgrp.lia_inventory_crud_app.controller;

import nxrgrp.lia_inventory_crud_app.entities.EquipmentType;
import nxrgrp.lia_inventory_crud_app.repository.EquipmentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/equipmenttypes")
public class EquipmentTypeController {

        @Autowired
        private EquipmentTypeRepository equipmentTypeRepository;

        @GetMapping
        public List<EquipmentType> getEquipmentTypeList() {
            return equipmentTypeRepository.findAll();
        }
    }
