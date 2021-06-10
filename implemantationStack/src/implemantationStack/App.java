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
			System.out.println("1.Push\n2.Pop\n3.Display Elements\n4.Search element\n5.Sort assending order\n6.Exit");
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
				int[] a = stack.display();
				for (int i = 0; i < a.length; i++) {
					System.out.print(a[i]+"\t");

				}
				break;
			case 4:
				System.out.println("Enter element to found");
				int item = sc.nextInt();
				stack.searchElement(item);
				break;

			case 5:
				int[] b = stack.sortStack();
				for (int i : b) {
					System.out.print(i + "\t");
				}
			case 6:
				System.out.println("Exit");
				System.exit(0);

			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

	}

}
