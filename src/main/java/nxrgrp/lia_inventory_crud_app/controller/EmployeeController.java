package nxrgrp.lia_inventory_crud_app.controller;

//import nxrgrp.lia_inventory_crud_app.repository.GreetingRepository;
//import nxrgrp.lia_inventory_crud_app.entities.Greeting;
//import nxrgrp.lia_inventory_crud_app.entities.Employee;
//import nxrgrp.lia_inventory_crud_app.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;

// Greeting ersätts av "Employee"

/*
@RestController                     - Aktuell klass kan ta emot anrop från användaren
@RequestMapping("api/employees")    - Kom åt metoder i aktuell klass via URL
public EmployeeController() {}      - Konstruktor för att skapa employeeRepository-objekt?

 */

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    /*
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping()
    public List<Employee> getEmployees(){
        return this.employeeRepository.findAll();
    }
}
*/

/* rev00
@RestController
public class EmployeeController {


    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
*/

    @GetMapping()
    public String employee() {
        // Step 1: Return Hello World!:
        return "Hello World!";
        //return getRandomEmployee();
    }

/*
    private String getRandomEmployee() {
        //Step 2: Return random greeting (stored in ArrayList):
        List<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Johanna.");
        Random random = new Random();
        int randomListIndex = random.nextInt(employees.size());
        return employees.get(randomListIndex);
*/
    /*
        // Step 3: Return static list from database


        List<Employee> employees = this.employeeRepository.findAll();
        Random random = new Random();
        int randomListIndex = random.nextInt(employees.size());
        return employees.get(randomListIndex).getFirst_name();
        */


//        }

}

