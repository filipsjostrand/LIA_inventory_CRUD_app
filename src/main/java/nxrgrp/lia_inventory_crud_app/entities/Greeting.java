package nxrgrp.lia_inventory_crud_app.entities;

import javax.persistence.*;

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
