package com.basicservlet.service;

import com.basicservlet.dao.PersonDAO;
import com.basicservlet.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 12/15/2017
*/
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDAO personDAO;

    @Override
    @Transactional
    public List<Person> listPersons() {
        return personDAO.listPersons();
    }

    @Override
    @Transactional
    public Person getByPersonId(int id) {
        return personDAO.getPersonById(id);
    }

    @Override
    @Transactional
    public void addPerson(Person person) {
        personDAO.addPerson(person);
    }

    @Override
    @Transactional
    public void updatePerson(Person person) {
        personDAO.updatePerson(person);
    }

    @Override
    @Transactional
    public void removePerson(int id) {
        personDAO.removePerson(id);
    }

}
