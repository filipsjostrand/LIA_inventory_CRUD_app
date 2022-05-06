package nxrgrp.lia_inventory_crud_app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    @Column(name = "Name", unique = true, nullable = false)
    private String name;

    @Column(name = "Location", unique = true, nullable = false)
    private String location;

    /*
    @OneToMany(targetEntity = Organization.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "organization_id", referencedColumnName = "id")
    private List<Organization> organization;
    */

    // För att skapa Foreign Key, FK (organization_id) i Employee-tabellen
    @OneToMany(mappedBy = "organization")
    @JsonIgnoreProperties("organization")
    private Set<Employee> employee;


    public Organization(String name, String location) {
        this.name = name;
        this.location = location;
    }

    protected Organization() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
