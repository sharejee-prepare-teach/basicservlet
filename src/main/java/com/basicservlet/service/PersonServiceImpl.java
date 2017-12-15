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
    public PersonDAO personDAO;

    @Override
    @Transactional
    public List<Person> listPersons() {
        return personDAO.listPersons();
    }

}
