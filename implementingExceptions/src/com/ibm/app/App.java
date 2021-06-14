package com.ibm.app;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.UUID;

import com.ibm.ToDo;

public class App {

	private static Scanner sc = new Scanner(System.in);

	private ToDo[] toDo;
	{
		toDo = new ToDo[2];
	}

	public static void main(String[] args) {

		App app = new App();

		try {
			// Here array size is 2 in for loop we given 3 so that it throws array index out
			// of bound exception
			String tdesc;
			boolean tempCompleted = true;

			for (int i = 0; i < 2; i++) {
				System.out.println("Enter todo desc");
				tdesc = sc.next();

				System.out.println("isCompleted?");
				try {
					tempCompleted = sc.nextBoolean();
				} catch (InputMismatchException e) {
					System.err.println("input mismatch");
				}

				app.toDo[i] = new ToDo(UUID.randomUUID().toString(), tdesc, tempCompleted);

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.print("Array index out bound");

		}

		for (int i = 0; i < 5; i++) {
			try {
				System.out.println(app.toDo[i]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("Array index out of bound");

			}
		}

	}

}
