package com.basicservlet.service;

import com.basicservlet.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 12/15/2017
*/
public interface PersonService {
    List<Person> listPersons();
   /* Person getByPersonId(int id);

    void addPerson(Person person);
    void updatePerson(Person person);
    void removePerson(int id);*/

}
