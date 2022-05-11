package nxrgrp.lia_inventory_crud_app.controller;

import nxrgrp.lia_inventory_crud_app.entities.Equipment;
import nxrgrp.lia_inventory_crud_app.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/equipment")
public class EquipmentController {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @GetMapping
    public List<Equipment> getEquipmentList() {

        return equipmentRepository.findAll();
    }

    // Create Equipment rest api
    @PostMapping
    public void addEquipment(@RequestBody Equipment equipment) {
        equipmentRepository.save(equipment);
    }



        /*
    @GetMapping("/{id}")
    public Employee getEmployeeId(@PathVariable("id") long id){
        return EmployeeList
                .stream()
                .filter
    }

     */

}
