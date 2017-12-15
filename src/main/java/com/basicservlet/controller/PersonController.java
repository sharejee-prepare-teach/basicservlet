package com.basicservlet.controller;

import com.basicservlet.model.Person;
import com.basicservlet.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 12/15/2017
*/
@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public String getPerson(Model model){
        model.addAttribute("person",new Person());
        model.addAttribute("persons",personService.listPersons());
        return "person";
    }

}
