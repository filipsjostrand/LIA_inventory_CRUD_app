package nxrgrp.lia_inventory_crud_app.controller;

import nxrgrp.lia_inventory_crud_app.entities.Employee;
import nxrgrp.lia_inventory_crud_app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
@RestController                     - Aktuell klass kan ta emot anrop från användaren
@RequestMapping("api/employees")    - Kom åt metoder i aktuell klass via URL
public EmployeeController() {}      - Konstruktor för att skapa employeeRepository-objekt?

 */

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getEmployeeList() {

        return employeeRepository.findAll();
    }
}

