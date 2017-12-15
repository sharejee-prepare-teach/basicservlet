package com.basicservlet.dao;

import com.basicservlet.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 12/15/2017
*/
@Repository
public class PersonDAOImpl implements PersonDAO {

    @Autowired
    public SessionFactory sessionFactory;

    private static final Logger logger = LoggerFactory.getLogger(PersonDAOImpl.class);

    @Override
    public List<Person> listPersons() {
        Session session = sessionFactory.getCurrentSession();
        List<Person> personList = session.createQuery("From Person").list();
        for(Person p : personList){
            logger.info("Person List::"+p);
        }
        return personList;
    }

}
