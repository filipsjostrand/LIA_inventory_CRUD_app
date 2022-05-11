package nxrgrp.lia_inventory_crud_app.service;

import nxrgrp.lia_inventory_crud_app.entities.EquipmentType;
import nxrgrp.lia_inventory_crud_app.repository.EquipmentTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentTypeService {


        EquipmentTypeRepository equipmentTypeRepository;

        public EquipmentTypeService(EquipmentTypeRepository equipmentTypeRepository) {
            this.equipmentTypeRepository = equipmentTypeRepository;
        }

        public List<EquipmentType> findAll() {
            return equipmentTypeRepository.findAll();
        }
}
