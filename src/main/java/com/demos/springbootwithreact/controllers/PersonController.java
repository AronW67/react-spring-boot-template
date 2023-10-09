package com.demos.springbootwithreact.controllers;

import com.demos.springbootwithreact.dtos.Person;
import com.demos.springbootwithreact.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getPersons() {
        return personService.getPersons();
    };

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }
}
