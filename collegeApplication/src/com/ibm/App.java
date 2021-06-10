package com.ibm;

import java.util.Scanner;

public class App {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Hostellers student=new Hostellers();
		
		System.out.println("Enter student id");
		student.setStudentId(sc.nextInt());
		System.out.println("Enter the student Name");
		student.setName(sc.next());
		System.out.println("Enter the dept id");
		student.setDepartmentId(sc.nextInt());
		System.out.println("Enter the gender");
		student.setGender(sc.next());
		System.out.println("Enter the phone number");
		student.setPhone(sc.next());
		System.out.println("Enter the hostel name");
		student.setHostelName(sc.next());
		System.out.println("Enter room number");
		student.setRoomNumber(sc.nextInt());
		System.out.println("Modify Phone Number(Y/N)");
		String pchange=sc.next();
		if(pchange.equals("y")) {
			System.out.println("New Phone Number");
			student.setPhone(sc.next());
		}
		System.out.println("Modify Room Number(Y/N)");
		String rChange=sc.next();
		if(rChange.equals("y")) {
			System.out.println("New Room Number");
			student.setRoomNumber(sc.nextInt());
		}
	
		System.out.println("The Student Details:");
		System.out.println(student.toString());

	}

}
