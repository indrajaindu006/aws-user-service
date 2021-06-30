package com.example.spring_hibernate_java_based.dao;

import java.util.List;

import com.example.spring_hibernate_java_based.dto.EmployeeDto;
import com.example.spring_hibernate_java_based.ui.EmployeeResponseModel;

public interface EmployeeDao {
	
	public EmployeeResponseModel createEmployee(EmployeeDto employeeDetails);

	public List<EmployeeResponseModel> displayAll();

	public EmployeeResponseModel findByEmployeeId(String id);

	public void updateById(String id);

	public void deleteById(String id); 

}
