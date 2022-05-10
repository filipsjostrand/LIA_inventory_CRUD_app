package nxrgrp.lia_inventory_crud_app.entities;

import javax.persistence.*;

// Skapa JPA-entitet som har "mappning" för den tabell som önskas

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", unique = true, nullable = false)       // employee_id default value should be null.
    private Long id;

    @Column(name = "first_name", unique = true, nullable = false)
    private String first_name;

    @Column(name = "last_name", unique = true, nullable = false)
    private String last_name;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "phone_number", unique = true, nullable = false)
    private String phone_number;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;


    public Employee() {

    }

    public Employee(String first_name, String last_name, String email, String phone_number, long organization_id) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        //this.organization_id = organization_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    //public Organization getOrganization() {
    //return organization;
    //}

    //public void setOrganization(Organization organization) {
    //this.organization = organization;
    //}
}
