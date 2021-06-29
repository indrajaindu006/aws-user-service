package com.example.spring_hibernate_integration;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.spring_hibernate_integration.model.Book;
import com.example.spring_hibernate_integration.service.BookService;
import com.example.spring_hibernate_integration.service.BookServiceImpl;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0, id;
		String bookName = null;
		double bookPrice = 0.0;
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BookService service = context.getBean("bookServiceImpl", BookServiceImpl.class);
		do {
			System.out.println("1.Add new book");
			System.out.println("2.Display all books");
			System.out.println("3.Find by book id");
			System.out.println("4.Update by book id");
			System.out.println("5.Delete by book id");
			System.out.println("6: Exit");
			System.out.print("Enter ur choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter book name");
				bookName = sc.next();
				System.out.println("Enter book price");
				bookPrice = sc.nextDouble();
				Book book = service.createBook(new Book(new Random().nextInt(100), bookName, bookPrice));
				System.out.println(book);
				System.out.println("Successfully created...");

				break;
			case 2:
				List<Book> list = service.displayAllBooks();
				for (Book book2 : list) {
					System.out.println(book2);
				}
				break;
			case 3:
				System.out.println("Enter Book id ");
				id = sc.nextInt();
				Book l = service.findById(id);
				if (l == null) {
					throw new BookNotFound("Book not found");
				} else
					System.out.println(l);
				break;
			case 4:
				System.out.println("Enter book id");
				id = sc.nextInt();
				service.updateById(id);
				System.out.println("Sucessfully updated");
				break;
			case 5:
				System.out.println("Enter book Id");
				id = sc.nextInt();
				service.deleteById(id);
				System.out.println("Sucessfully deleted...");
				break;
			case 6:
				System.out.println("Exit..");
				System.exit(0);
				break;

			default:
				break;

			}
		} while (choice != 0);

	}
}
