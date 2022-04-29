package nxrgrp.lia_inventory_crud_app.repository;

import nxrgrp.lia_inventory_crud_app.entities.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

// The GreetingRepository-interface is used to save and fetch data to and from the database.

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
}
