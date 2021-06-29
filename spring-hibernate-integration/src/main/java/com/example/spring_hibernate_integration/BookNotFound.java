package com.example.spring_hibernate_integration;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BookNotFound extends RuntimeException {
	
	private String message;

}
