package implemantationStack;

import java.util.Scanner;

public class App {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int choice = 0;
		StackImpl stack = new StackImpl();
		System.out.println("Enter the size of the stack");
		int len = sc.nextInt();
		stack.createStack(len);

		do {
			System.out.println("1.Push\n2.Pop\n3.Exit");
			System.out.println("Enter the choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:

				System.out.print("Enter integer to the stack");
				int value = sc.nextInt();
				stack.push(value);
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				System.out.println("Exitr");
				System.exit(0);

			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

	}

}
