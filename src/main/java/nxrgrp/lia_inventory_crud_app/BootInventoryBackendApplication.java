package nxrgrp.lia_inventory_crud_app;


import nxrgrp.lia_inventory_crud_app.entities.Employee;
import nxrgrp.lia_inventory_crud_app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootInventoryBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BootInventoryBackendApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        this.employeeRepository.save(new Employee("Nexer vxo", "John", "Doe", "john.doe@nexergroup.com", "0739119119"));
        this.employeeRepository.save(new Employee("Nexer vxo", "Johanna", "Doe", "johanna.doe@nexergroup.com", "0739119110"));
    }

}
