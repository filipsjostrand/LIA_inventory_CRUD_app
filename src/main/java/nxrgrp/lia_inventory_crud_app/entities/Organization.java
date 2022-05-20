package nxrgrp.lia_inventory_crud_app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "organization")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "location", unique = true, nullable = false)
    private String location;

    
    
    @OneToMany(mappedBy = "organization")
    @JsonIgnoreProperties("organization")
    //private Set<Employee> employee;
    private List<Employee> employee;

    /*
    @OneToMany(targetEntity = Employee.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "organization_id", referencedColumnName = "id")
    private List<Employee> employeeList;
    */

    //private Collection<Employee> employee;



    public Organization(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Organization() {
    }

    public Long getId() {
        return id;
    }

    // ((public long getOrganizationId() {return organization_id = id};

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
