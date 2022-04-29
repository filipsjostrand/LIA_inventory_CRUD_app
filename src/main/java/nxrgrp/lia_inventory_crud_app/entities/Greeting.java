package nxrgrp.lia_inventory_crud_app.entities;

import javax.persistence.*;

/*
The Greeting.java class is used to create Greeting table in the console through JPA(Hibernate).
One of the Greeting constructors accepts the name parameter and helps bring coded Greeting values to the database.
*/

@Entity
@Table(name = "greeting")
public class Greeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    public Greeting(String name) {
        this.name = name;
    }

    protected Greeting() {}

    public String getName() {
        return name;
    }
}
