package nxrgrp.lia_inventory_crud_app.controller;

import nxrgrp.lia_inventory_crud_app.entities.Equipment;
import nxrgrp.lia_inventory_crud_app.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
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
    public Equipment addEquipment(@RequestBody Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    // create equipment rest api
    @GetMapping("{id}")
    public ResponseEntity<Equipment> getEquipmentById(@PathVariable Long id) {

        Equipment equipment = equipmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Equipment does not exist with id" + id));
        return ResponseEntity.ok(equipment);
    }
        /*
    @GetMapping("/{id}")
    public Employee getEmployeeId(@PathVariable("id") long id){
        return EmployeeList
                .stream()
                .filter
    }

     */

    // update equipment rest api

    @PutMapping({"{id}"})
    public ResponseEntity<Equipment> updateEquipment(@PathVariable Long id, @RequestBody Equipment equipmentDetails) {

        Equipment equipment = equipmentRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Equipment does not exist with id" + id));

        equipment.setUnique_id_serial(equipmentDetails.getUnique_id_serial());
        equipment.setModel_name(equipmentDetails.getModel_name());
        equipment.setDate_of_purchase(equipmentDetails.getDate_of_purchase());

        Equipment updateEquipment = equipmentRepository.save(equipment);
        return ResponseEntity.ok(updateEquipment);
    }

}
