package com.basicservlet.dao;

import com.basicservlet.model.Person;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 12/15/2017
*/
public interface PersonDAO {
    List<Person> listPersons();
   /* Person getPersonById(int id);

    void addPerson(Person person);
    void updatePerson(Person person);
    void removePerson(int id);*/

}
