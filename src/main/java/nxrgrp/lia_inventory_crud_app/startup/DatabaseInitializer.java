package nxrgrp.lia_inventory_crud_app.startup;

//Mappa ihop controllers & services

import nxrgrp.lia_inventory_crud_app.entities.Employee;
import nxrgrp.lia_inventory_crud_app.repository.EmployeeRepository;
//import org.fastnate.generator.EntitySqlGenerator;
//import org.fastnate.generator.context.GeneratorContext;
//import org.fastnate.generator.dialect.H2Dialect;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
@Component
@Profile("does not exist")
//public class DatabaseInitializer implements ApplicationRunner {
public class DatabaseInitializer implements ApplicationRunner {

    private final EmployeeRepository employeeRepository;

    public DatabaseInitializer(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> employees = new ArrayList<>();
        employees.add("John");
        employees.add("Good morning.");

        List<Employee> employeeList = employees
                .stream()
                .map(employee -> new Employee(employee)).collect(Collectors.toList());
        //this.generateInserSql(employeeList);
        //this.greetingRepository.saveAll(greetingList);
    }

    /*
    public <E> void generateInserSql(final Iterable<? extends E> entities) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        EntitySqlGenerator sqlGenerator = new EntitySqlGenerator(new GeneratorContext(
                new H2Dialect()
        ), printWriter);
        sqlGenerator.write(entities);
        sqlGenerator.flush();
        sqlGenerator.close();
        printWriter.close();
    }
     */
//}