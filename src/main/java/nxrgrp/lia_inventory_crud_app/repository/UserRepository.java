package nxrgrp.lia_inventory_crud_app.repository;

import nxrgrp.lia_inventory_crud_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
