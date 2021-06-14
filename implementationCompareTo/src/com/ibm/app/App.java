package com.ibm.app;

import java.util.Scanner;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

import com.ibm.DescComparator;
import com.ibm.PriorityComparator;
import com.ibm.ToDo;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		App app = new App();
		DescComparator descComp = new DescComparator();
		PriorityComparator priorityComp = new PriorityComparator();
		Set<ToDo> set = new TreeSet<ToDo>(priorityComp);

		int choice;
		do {
			System.out.println("1.Create \n2.Remove\n3.update\n4.Display");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				ToDo toDo = new ToDo();
				toDo.setId(UUID.randomUUID().toString());
				System.out.println("Enter description ");
				toDo.setDesc(sc.next());
				System.out.println("Enter Priority");
				toDo.setPriority(sc.nextInt());
				set.add(toDo);
				System.out.println("Added successfully");

				break;
			case 2:
				ToDo todo = null;
				System.out.println("Enter Remove id");
				String r = sc.next();

				Iterator<ToDo> i = set.iterator();

				while (i.hasNext()) {
					todo = i.next();
					if (todo.getId().equals(r)) {
						set.remove(todo);
					}

				}

				break;
			case 3:
				boolean found = false;
				System.out.println("Enter Update id");

				try {
					String uId = sc.next();

					for (ToDo toDo2 : set) {
						if (toDo2.getId().equals(uId)) {
							System.out.println("Enter description");
							toDo2.setDesc(sc.next());
							System.out.println("enter priority");
							toDo2.setPriority(sc.nextInt());
							found = true;
						}

					}
					app.check(found);
				} catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("Updated succefully");
				break;
			case 4:
				System.out.println("Display");
				for (ToDo toDo2 : set) {
					System.out.println(toDo2);
				}
				break;
			default:
				break;
			}

		} while (choice != 0);

	}

	private void check(boolean found) {
		if (found == false) {
			throw new IdNotFoundException("Id not found");
		}

	}

}
