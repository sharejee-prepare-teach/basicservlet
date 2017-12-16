package com.basicservlet.controller;

import com.basicservlet.model.Person;
import com.basicservlet.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
Create By: Ron Rith
Create Date: 12/15/2017
*/
@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/persons",method = RequestMethod.GET)
    public String getPerson(Model model){
        model.addAttribute("person",new Person());
        model.addAttribute("persons",personService.listPersons());
        return "person";
    }

    //Add or Update
    @RequestMapping(value = "/person/add",method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("person") Person person){
       if (person.getId() == null){
           personService.addPerson(person);
       }else {
           personService.updatePerson(person);
       }
        return "redirect:/persons";
    }

    @RequestMapping(value = "/edit/{id}")
    public String editPerson(@PathVariable("id") Integer id,Model model){
        model.addAttribute("person",personService.getByPersonId(id));
        model.addAttribute("persons",personService.listPersons());
        return "person";
    }

    @RequestMapping(value = "/remove/{id}")
    public String removePerson(@PathVariable("id") Integer id){
        personService.removePerson(id);
        return "redirect:/persons";
    }




}
