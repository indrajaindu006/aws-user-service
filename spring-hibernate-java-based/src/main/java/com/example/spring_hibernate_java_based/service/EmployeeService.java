package com.example.spring_hibernate_java_based.service;

import java.util.List;

import com.example.spring_hibernate_java_based.ui.EmployeeRequestModel;
import com.example.spring_hibernate_java_based.ui.EmployeeResponseModel;

public interface EmployeeService {

	public EmployeeResponseModel createEmployee(EmployeeRequestModel employeeDetails);

	public List<EmployeeResponseModel> displayAll();

	public EmployeeResponseModel findByEmployeeId(String id);

	public void updateById(String id);

	public void deleteById(String id);

}
