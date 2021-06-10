package com.ibm;

public class Manager extends Employee {
	private String departmentName;

	public Manager() {
		super();
	}

	public Manager(int employeeId, String firstName, String lastName, String gmail, EmployeeType employeeType,
			String departmentName) {
		super(employeeId, firstName, lastName, gmail, employeeType);
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "Manager [departmentName=" + departmentName + ", toString()=" + super.toString() + "]";
	}

}
