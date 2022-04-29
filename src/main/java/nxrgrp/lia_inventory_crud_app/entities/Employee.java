package nxrgrp.lia_inventory_crud_app.entities;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "organization_id")
    private String organization_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phone_number;

    public Employee(String organization_id, String first_name, String last_name, String email, String phone_number) {
        super();
        this.organization_id = organization_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
    }

    /*
    public Employee(String name) {
        this.name = name;
    }
    */
    protected Employee() {}

    //Rödmarkering försvinner på rad 41 ("... -> new Employee(employee))") i DatabaseInitializer.java
    public Employee(String employee) {
    }

    /*
    public String getName() {
        return name;
    }
    */

    public Long getId() {
        return id;
    }

    public String getOrganization_id() {
        return organization_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }
}