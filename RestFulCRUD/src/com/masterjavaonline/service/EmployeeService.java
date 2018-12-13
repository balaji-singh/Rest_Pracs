package com.masterjavaonline.service;

import java.util.List;

import com.masterjavaonline.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();

	public Employee getEmpById(int id);

	public int addEmployee(Employee emp);

	public int deleteById(int id);

	public int update(Employee emp);

}
