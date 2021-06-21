package com.ibm.exceptions;

public class IdNotFoundException extends RuntimeException {
	
	private String message;

	

	public IdNotFoundException(String message) {
		
		super();
		this.message=message;
	}



	@Override
	public String getMessage() {
		return super.getMessage();
	}
	

}
