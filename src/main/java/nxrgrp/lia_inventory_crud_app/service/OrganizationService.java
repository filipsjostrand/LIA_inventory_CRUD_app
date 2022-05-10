package nxrgrp.lia_inventory_crud_app.service;

import nxrgrp.lia_inventory_crud_app.entities.Organization;
import nxrgrp.lia_inventory_crud_app.repository.OrganizationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {

    OrganizationRepository organizationRepository;

    public OrganizationService(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    public List<Organization> findAll() {
        return organizationRepository.findAll();
    }
}
