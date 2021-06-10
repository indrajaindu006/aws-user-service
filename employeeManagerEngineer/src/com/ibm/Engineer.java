package com.ibm;

public class Engineer extends Employee {

	private String stream;

	public Engineer() {
		super();
	}

	public Engineer(int employeeId, String firstName, String lastName, String gmail, EmployeeType employeeType,
			String stream) {
		super(employeeId, firstName, lastName, gmail, employeeType);
		this.stream = stream;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Engineer [stream=" + stream + ", toString()=" + super.toString() + "]";
	}

}
