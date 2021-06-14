package com.ibm.app;

public class InvalidSalaryException extends  RuntimeException{
	
	private String message;

	public InvalidSalaryException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
	
	

}
