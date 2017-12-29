package com.basicservlet.dao;

import com.basicservlet.model.Employee;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 12/29/2017
*/
public interface EmployeeDAO {
    public void saveEmployee(Employee employee);
    public Employee getEmployeeById(int id);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(int id);
    public List<Employee> getAllEmployees();
}
