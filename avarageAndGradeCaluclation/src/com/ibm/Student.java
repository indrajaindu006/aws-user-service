package com.ibm;

import java.util.Arrays;

public class Student {
	private int id;
	private String name;
	private int[] marks;
	private float avg;
	private char grade;

	public Student() {
		super();
	}

	public Student(int id, String name, int[] marks, float avg, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.avg = avg;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", avg=" + avg
				+ ", grade=" + grade + "]";
	}

}
