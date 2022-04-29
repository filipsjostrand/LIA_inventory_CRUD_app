package nxrgrp.lia_inventory_crud_app.repository;

import nxrgrp.lia_inventory_crud_app.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
