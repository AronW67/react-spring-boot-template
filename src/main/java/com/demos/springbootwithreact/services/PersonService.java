package com.demos.springbootwithreact.services;

import com.demos.springbootwithreact.dtos.Person;
import com.demos.springbootwithreact.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(
            PersonRepository personRepository
    ) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersons() {
        return personRepository.findAll();
    };

    public void addPerson(Person person) {
        personRepository.save(person);
    }
}
