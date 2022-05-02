package nxrgrp.lia_inventory_crud_app.controller;

import java.util.List;

import nxrgrp.lia_inventory_crud_app.model.User;
import nxrgrp.lia_inventory_crud_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Create Rest-API with simple rest-end-point "users"

@RestController
@RequestMapping("api/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getUsers(){
        return this.userRepository.findAll();
    }
}