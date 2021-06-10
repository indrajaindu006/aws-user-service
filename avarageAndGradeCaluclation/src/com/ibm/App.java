package com.ibm;

import java.util.Scanner;

public class App {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int id;
		String name;
		float avg;
		char grade;
		int sub;
		int total_marks = 0;

		App a = new App();
		Student s = new Student();

		System.out.println("enter id");
		id = sc.nextInt();
		System.out.println("enter name");
		name = sc.next();
		System.out.println("Enter number of subjects");
		sub = sc.nextInt();
		for (int j = 0; j < sub; j++) {
			System.out.println("Enter mark for subject" + j);
			total_marks += sc.nextInt();
		}
		
		
		System.out.println("Student id :"+id);
		System.out.println("Student Name :"+name);
		System.out.println("Student average :"+a.calculateAvg(total_marks,sub));
		double avggrade=a.calculateAvg(total_marks,sub);
		System.out.println("Student grade :"+a.findGrade(avggrade));
		
		

	}
	
	public float calculateAvg(int total_marks,int sub) {
		
		return (float) total_marks / sub;
	}
	
	public char findGrade(double grade) {
		if(grade>80)
		return 'O';
		else if(grade<70)
			return 'A';
		else
			return 'F';
		
		
	}

}
