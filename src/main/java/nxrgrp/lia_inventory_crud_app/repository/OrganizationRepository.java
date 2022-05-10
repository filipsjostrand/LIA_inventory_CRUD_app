package nxrgrp.lia_inventory_crud_app.repository;

import nxrgrp.lia_inventory_crud_app.entities.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {

}
