
package nxrgrp.lia_inventory_crud_app.controller;

import nxrgrp.lia_inventory_crud_app.entities.Organization;
import nxrgrp.lia_inventory_crud_app.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("api/organizations")
public class OrganizationController {

    @Autowired
    private OrganizationRepository organizationRepository;

    @GetMapping
    public List<Organization> getOrganizationList() {
        return organizationRepository.findAll();
    }
}

// Gör getmapping för "{/id}"

// skapa postmapping och skapa employee



    // Metod i OrganizationService som tar hand om getOrganization-anropet och returnerar en organisations-lista.

    //public String employee() {



        //@Autowired
        //private Organization organizationRepository;

        //OrganizationService organizationService;

    /*
    @GetMapping("api/organization")
        public void getOrganization(@PathVariable("id") long id){
        return organizationList
                .stream()
                .filter(organization -> Organization.getId() == id)
                .findFirst()
                .orElseThrow();
        }


@CrossOrigin(origins = "http://localhost:3000/")
    @RestController
    @RequestMapping("api/organization")
    public class OrganizationController {

    @Autowired
    private Organization organizationRepository;

    @GetMapping()
    //public String employee() {
    public List<Organization> getOrganization() {
        return this.organizationRepository.findAll();
    }
}
*/