package nxrgrp.lia_inventory_crud_app.service;

import nxrgrp.lia_inventory_crud_app.entities.Employee;
import nxrgrp.lia_inventory_crud_app.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
