package com.example.demo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.config.MyConfig;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import com.example.demo.service.BookServiceImpl;

public class App {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException {

		int choice = 0, id;
		String bookName = null;
		double bookPrice = 0.0;
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
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
				System.out.println("book_id\tbook_name\tprice");
				System.out.println("-------------------------------");
				for (Book book2 : list) {
					book2.display();
				}
				break;
			case 3:
				System.out.println("Enter Book id ");
				id = sc.nextInt();
				List<Book> list1 = service.findById(id);
				if (list1.isEmpty()) {
					throw new BookNotFound("Book not found");
				} else
					System.out.println(list1);
				break;
			case 4:
				Book b=new Book();
				System.out.println("Enter book id");
				id=sc.nextInt();
				System.out.println("Enter new book name");
				String nBook=sc.next();
				System.out.println("Enter new price");
				Double nPrice=sc.nextDouble();
				b=new Book(id, nBook, nPrice);
				Book book1=service.updateById(b);
				System.out.println(book1);
				break;
			case 5:
				System.out.println("Enter book Id");
				id=sc.nextInt();
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
