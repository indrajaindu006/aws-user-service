package org.example.hibernate_curd_demo.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class EmployeeNotFoundException extends RuntimeException {
	private String message;

}
