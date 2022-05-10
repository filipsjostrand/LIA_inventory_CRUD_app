package nxrgrp.lia_inventory_crud_app;

import nxrgrp.lia_inventory_crud_app.entities.Employee;
import nxrgrp.lia_inventory_crud_app.entities.Organization;
import nxrgrp.lia_inventory_crud_app.repository.EmployeeRepository;
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
            EmployeeRepository employeeRepository,
            OrganizationRepository organizationRepository) {
        return args -> {

            Organization jonkoping = new Organization("JKPNG", "Jönköping");
            Organization vaxjo = new Organization("VXO", "Växjö");
            organizationRepository.saveAll(List.of(jonkoping, vaxjo));

            Employee cecilia = new Employee("Cecilia", "Campbell", "cecilia.campbell@dmail.com", "2468999999", 1);
            Employee chris = new Employee("Chris", "Columbus", "chris.columbus@dmail.com", "2468888888", 2);
            employeeRepository.saveAll(List.of(cecilia, chris));

        };
    }
}
