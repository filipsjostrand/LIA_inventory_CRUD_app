package nxrgrp.lia_inventory_crud_app.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

// Skapa JPA-entitet som har "mappning" för den tabell som önskas

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID", unique = true, nullable = false)
    private Long id;

    //@OneToMany(mappedBy = "Organization",  fetch = FetchType.LAZY)


    //@Column(name = "OrganizationId", unique = true, nullable = false)
    //private int organization_id;

    // Tvingas sätta name = (annat än organization_id
    //@Column(name = "Org_Id", unique = true, nullable = false)
    //private int organization_id;

    @Column(name = "Firstname", unique = true, nullable = false)
    private String first_name;


    @Column(name = "Lastname", unique = true, nullable = false)
    private String last_name;

    //@OneToMany(targetEntity = Organization.class, cascade = CascadeType.ALL)
    //@OneToMany(cascade = CascadeType.ALL)
    //@JoinColumn(name = "organization_id", referencedColumnName = "id")
    //private List<Organization> organization;

    //@ManyToOne(mappedBy = "Organization")
    //@JsonIgnoreProperties("Organization")
    //private Organization organization;

    // För att skapa Foreign Key, FK (organization_id) i Employee-tabellen
    //@ManyToOne
    //@JoinColumn(name = "organization_id")
    //private Organization organization;
                                                                        //(("BlogPost"))
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    public Employee() {

    }

    //Problem (2022-05-06): org_id & organization_id skapas av Flyway

    public Employee(String first_name, String last_name, long organization_id) {
        //super();
        this.first_name = first_name;
        this.last_name = last_name;
    }

    /*
    public Employee(int organization_id, String first_name) {
        super();
        this.organization_id = organization_id;
        this.first_name = first_name;
    }
    */

    //protected Employee() {
    //}

    public Long getId() {
        return id;
    }

    /*
    public int getOrganization_id() {
        return organization_id;
    }
     */

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

}

    /*
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
    */

    //public Employee(String organization_id, String first_name, String last_name, String email, String phone_number) {
    //    super();

        /*
        this.organization_id = organization_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        */

/*
    }


    public Employee(String name) {
        this.name = name;
    }

    protected Employee() {}

    //Rödmarkering försvinner på rad 41 ("... -> new Employee(employee))") i DatabaseInitializer.java
    //public Employee(String employee) {
    //}

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }
*/

    /*
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
    */
//}
