package com.ibm;

public enum EmployeeType {
	SALARIED("Salaried employee"),
	HOORLY_PAID("Hourly paid employee");
	
	private String message;
	
	private EmployeeType(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}
	
	

}
