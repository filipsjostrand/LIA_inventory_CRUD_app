package nxrgrp.lia_inventory_crud_app;

import nxrgrp.lia_inventory_crud_app.model.User;
import nxrgrp.lia_inventory_crud_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// React JS + Spring Boot REST API Example Tutorial https://www.youtube.com/watch?v=5RA5NpxbioI&ab_channel=JavaGuides

@SpringBootApplication
public class LiaInventoryCrudAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(LiaInventoryCrudAppApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("Filip", "Sjöstrand", "filips@fmail.com"));
        this.userRepository.save(new User("Tom", "Cruise", "tom@gmail.com"));
        this.userRepository.save(new User("Tony", "Stark", "tony@gmail.com"));
    }

}
