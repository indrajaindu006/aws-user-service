package com.example.spring_hibernate_java_based.service;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_hibernate_java_based.dao.EmployeeDao;
import com.example.spring_hibernate_java_based.dto.EmployeeDto;
import com.example.spring_hibernate_java_based.ui.EmployeeRequestModel;
import com.example.spring_hibernate_java_based.ui.EmployeeResponseModel;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDaoImpl;
	private ModelMapper modelMapper;

	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDaoImpl, ModelMapper modelMapper) {
		this.employeeDaoImpl = employeeDaoImpl;
		this.modelMapper = modelMapper;
	}

	@Override
	public EmployeeResponseModel createEmployee(EmployeeRequestModel employeeDetails) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		EmployeeDto dto = modelMapper.map(employeeDetails, EmployeeDto.class);
		dto.setEmployeeId(UUID.randomUUID().toString());
		return employeeDaoImpl.createEmployee(dto);
	}

	@Override
	public List<EmployeeResponseModel> displayAll() {

		return employeeDaoImpl.displayAll();
	}

	@Override
	public EmployeeResponseModel findByEmployeeId(String id) {
		return employeeDaoImpl.findByEmployeeId(id);
	}

	@Override
	public void updateById(String id) {
		employeeDaoImpl.updateById(id);
	}

	@Override
	public void deleteById(String id) {
		employeeDaoImpl.deleteById(id);
	}

}
