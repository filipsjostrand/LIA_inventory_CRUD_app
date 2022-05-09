package nxrgrp.lia_inventory_crud_app;


//import nxrgrp.lia_inventory_crud_app.entities.Employee;
import nxrgrp.lia_inventory_crud_app.entities.Employee;
import nxrgrp.lia_inventory_crud_app.entities.Organization;
import nxrgrp.lia_inventory_crud_app.repository.EmployeeRepository;
import nxrgrp.lia_inventory_crud_app.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
//public class BootInventoryBackendApplication implements CommandLineRunner {
//public class BootInventoryBackendApplication implements CommandLineRunner {
public class BootInventoryBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootInventoryBackendApplication.class, args);
    }

    /*
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        this.employeeRepository.save(new Employee("Cecilia", "Campbell"));
        this.employeeRepository.save(new Employee("Chris", "Cane"));
        this.organizationRepository.save(new Organization())
     */

    @Bean
    CommandLineRunner init(
            EmployeeRepository employeeRepository,
            OrganizationRepository organizationRepository) {
        return args -> {

            Organization jonkoping = new Organization("JKPNG", "Jönköping");
            Organization vaxjo = new Organization("VXO", "Växjö");
            organizationRepository.saveAll(List.of(jonkoping, vaxjo));

            Employee cecilia = new Employee("Cissi", "Campbell", 1);
            Employee chris = new Employee("Chris", "Columbus", 2);
            employeeRepository.saveAll(List.of(cecilia, chris));

        };
/*
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        this.employeeRepository.save(new Employee("Nexer vxo", "John", "Doe", "john.doe@nexergroup.com", "0739119119"));
        this.employeeRepository.save(new Employee("Nexer vxo", "Johanna", "Doe", "johanna.doe@nexergroup.com", "0739119110"));
    }
*/
    }
}
