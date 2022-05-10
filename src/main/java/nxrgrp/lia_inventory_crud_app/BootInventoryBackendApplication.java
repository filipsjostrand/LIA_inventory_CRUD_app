package nxrgrp.lia_inventory_crud_app;

import nxrgrp.lia_inventory_crud_app.entities.Employee;
import nxrgrp.lia_inventory_crud_app.entities.Equipment;
import nxrgrp.lia_inventory_crud_app.entities.EquipmentType;
import nxrgrp.lia_inventory_crud_app.entities.Organization;
import nxrgrp.lia_inventory_crud_app.repository.EmployeeRepository;
import nxrgrp.lia_inventory_crud_app.repository.EquipmentRepository;
import nxrgrp.lia_inventory_crud_app.repository.EquipmentTypeRepository;
import nxrgrp.lia_inventory_crud_app.repository.OrganizationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BootInventoryBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootInventoryBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner init(
            OrganizationRepository organizationRepository,
            EquipmentTypeRepository EquipmentTypeRepository,
            EmployeeRepository employeeRepository,
            EquipmentRepository equipmentRepository)

    {
        return args -> {

            Organization jonkoping = new Organization("JKPNG", "Jönköping");
            Organization vaxjo = new Organization("VXO", "Växjö");
            organizationRepository.saveAll(List.of(jonkoping, vaxjo));

            EquipmentType Phone1 = new EquipmentType("Phone");
            EquipmentType Computer1 = new EquipmentType("Computer");
            EquipmentTypeRepository.saveAll(List.of(Phone1, Computer1));

            Employee cecilia = new Employee("Cecilia", "Campbell", "cecilia.campbell@dmail.com", "2468999999", 1);
            Employee chris = new Employee("Chris", "Columbus", "chris.columbus@dmail.com", "2468888888", 2);
            employeeRepository.saveAll(List.of(cecilia, chris));

            Equipment phone1 = new Equipment("1a2a3a", "iPhone 11", "2021-10-10");
            Equipment computer1 = new Equipment("334455", "MacBook Pro (13-inch, M1, 2020)", "2020-11-20");
            equipmentRepository.saveAll(List.of(phone1, computer1));

        };
    }
}
