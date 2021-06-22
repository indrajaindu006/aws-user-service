package org.example.hibernate_curd_demo.dao;

import java.util.List;

import org.example.hibernate_curd_demo.model.Employee;

public interface EmployeeDao {
	public Employee createEmployee(Employee employee);

	public List<Employee> displayAllEmployee();

	public Employee getemployeeById(Integer id);

	public Employee updateEmployee(Integer id);

	public void deleteEmployee(Integer id);

}
