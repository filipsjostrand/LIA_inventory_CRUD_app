package nxrgrp.lia_inventory_crud_app.entities;

import javax.persistence.*;

@Entity
@Table(name = "greeting")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    public Employee(String name) {
        this.name = name;
    }

    protected Employee() {}

    public String getName() {
        return name;
    }
}
