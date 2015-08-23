package com.sssss.dao;


import com.sssss.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
	public void saveEmployee(Employee employee);
	public List<Employee> getAllEmployees(Employee employee);
	public Employee getEmployeeById(String employeeId);
	public void deleteEmployee(Employee employee);
}

