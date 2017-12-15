package com.basicservlet.controller;


import com.basicservlet.model.Person;
import com.basicservlet.service.PersonService;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 12/15/2017
*/
@RestController
@RequestMapping(value = "/rest/persons")
public class PersonRestController {
    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Person> getPersons(){
        List<Person> persons = (List<Person>) personService.listPersons();
        return persons;
    }

    @RequestMapping(value = {"/{id}"},method = RequestMethod.GET)
    public Person getPersonById(@PathVariable("id") Integer id){
        Person person = (Person) personService.getByPersonId(id);
        return person;
    }
}
