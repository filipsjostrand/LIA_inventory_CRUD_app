package nxrgrp.lia_inventory_crud_app.controller;

//import nxrgrp.lia_inventory_crud_app.repository.GreetingRepository;
//import nxrgrp.lia_inventory_crud_app.entities.Greeting;
import nxrgrp.lia_inventory_crud_app.entities.Greeting;
import nxrgrp.lia_inventory_crud_app.repository.GreetingRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class GreetingController {

    private final GreetingRepository greetingRepository;

    public GreetingController(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @GetMapping("/greeting")
    public String greeting() {
        // Step 1: Return Hello World!: return "Hello World!";
        return getRandomGreeting();
    }


    private String getRandomGreeting() {
        /* Step 2: Return random greeting (stored in ArrayList):
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello!");
        greetings.add("Good morning.");
        greetings.add("Good afternoon.");
        greetings.add("Good evening.");
        greetings.add("It's nice to meet you.");
        Random random = new Random();
        int randomListIndex = random.nextInt(greetings.size());
        return greetings.get(randomListIndex);
         */

        // Step 3: Return static list from database
        List<Greeting> greetings = this.greetingRepository.findAll();
        Random random = new Random();
        int randomListIndex = random.nextInt(greetings.size());
        return greetings.get(randomListIndex).getName();
    }

}