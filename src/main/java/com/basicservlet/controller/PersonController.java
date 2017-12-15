package com.basicservlet.controller;


import com.basicservlet.model.Person;
import com.basicservlet.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 12/15/2017
*/
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = {"/persons"})
    public List<Person> getPersons(){
        List<Person> persons = (List<Person>) personService.listPersons();
        return persons;
    }
}
