package nxrgrp.lia_inventory_crud_app.startup;

import nxrgrp.lia_inventory_crud_app.entities.Greeting;
import nxrgrp.lia_inventory_crud_app.repository.GreetingRepository;
import org.fastnate.generator.EntitySqlGenerator;
import org.fastnate.generator.context.GeneratorContext;
import org.fastnate.generator.dialect.H2Dialect;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
The DatabaseInitializer.java class starts when the application starts.
The DatabaseInitializer()-method initiates a greetingRepository object?
The "run"-method ensures that coded values are added to the greetings list.
The values are sorted into a list and a generateInserSQL-object(?) named(?) greetingList is created.
A "printWriter"-object is created ...?
*/

@Component
@Profile("does not exist")
public class DatabaseInitializer implements ApplicationRunner {

    private final GreetingRepository greetingRepository;

    public DatabaseInitializer(GreetingRepository greetingRepository) {

        this.greetingRepository = greetingRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello!");
        greetings.add("Good morning.");
        greetings.add("Good afternoon.");
        greetings.add("Good evening.");
        greetings.add("It's nice to meet you.");
        greetings.add("It's a pleasure to meet you.");
        List<Greeting> greetingList = greetings.stream().map(greeting
                -> new Greeting(greeting)).collect(Collectors.toList());
        this.generateInserSql(greetingList);
        //this.greetingRepository.saveAll(greetingList);
    }

    public <E> void generateInserSql(final Iterable<? extends E> entities) throws IOException {
        PrintWriter printWriter = new PrintWriter(System.out);
        EntitySqlGenerator sqlGenerator = new EntitySqlGenerator(new GeneratorContext(
                new H2Dialect()
        ), printWriter);
        sqlGenerator.write(entities);
        sqlGenerator.flush();
        sqlGenerator.close();
        printWriter.close();
    }
}

