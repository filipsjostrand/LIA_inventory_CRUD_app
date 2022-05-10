package nxrgrp.lia_inventory_crud_app.service;

import nxrgrp.lia_inventory_crud_app.entities.Equipment;
import nxrgrp.lia_inventory_crud_app.repository.EquipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    EquipmentRepository equipmentRepository;

    public EquipmentService(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    public List<Equipment> findAll() {
        return equipmentRepository.findAll();
    }
}
