package com.basicservlet.controller.employee;

import com.basicservlet.dao.EmployeeDAO;
import com.basicservlet.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 12/29/2017
*/
@RestController
public class RestEmployeeController {
    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/rest_employees")
    private List<Employee> getAllEmployees(){
        return (List<Employee>) employeeDAO.getAllEmployees();
    }
}
