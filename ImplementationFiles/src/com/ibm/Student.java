package com.ibm;

public class Student implements Comparable {

	private String studentId;
	private String firstName;
	private String lastName;
	private String gmail;
	private double GPA;

	public Student() {
		super();
	}

	public Student(String studentId, String firstName, String lastName, String gmail, double gPA) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gmail = gmail;
		GPA = gPA;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", gmail="
				+ gmail + ", GPA=" + GPA + "]";
	}

	@Override
	public int compareTo(Object o) {
		if (this.GPA > ((Student) o).GPA)
			return -1;
		if (this.GPA < ((Student) o).GPA)
			return 1;
		else
			return 0;
	}

}
