package com.example.spring_hibernate_java_based.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDto {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String gmail;
}
