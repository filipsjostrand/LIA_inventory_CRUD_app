package nxrgrp.lia_inventory_crud_app.controller;

//import nxrgrp.lia_inventory_crud_app.repository.GreetingRepository;
//import nxrgrp.lia_inventory_crud_app.entities.Greeting;
import nxrgrp.lia_inventory_crud_app.entities.Employee;
import nxrgrp.lia_inventory_crud_app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

// Greeting ersätts av "Employee"

@RestController
@RequestMapping("api/")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("employees")
    public List<Employee> getEmployees(){
        return this.employeeRepository.findAll();
    }
}

/*
@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee")
    public String employee() {
        // Step 1: Return Hello World!: return "Hello World!";
        return getRandomEmployee();
    }


    private String getRandomEmployee() {
        /* Step 2: Return random greeting (stored in ArrayList):
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello!");
        greetings.add("Good morning.");
        greetings.add("Good afternoon.");
        greetings.add("Good evening.");
        greetings.add("It's nice to meet you.");
        Random random = new Random();
        int randomListIndex = random.nextInt(greetings.size());
        return greetings.get(randomListIndex);
         */

        // Step 3: Return static list from database

/*
        List<Employee> employees = this.employeeRepository.findAll();
        Random random = new Random();
        int randomListIndex = random.nextInt(employees.size());
        return employees.get(randomListIndex).getFirst_name();
    }

}
*/