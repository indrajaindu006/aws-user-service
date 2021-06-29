package com.example.spring_hibernate_integration.repository;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring_hibernate_integration.BookNotFound;
import com.example.spring_hibernate_integration.model.Book;

@Repository
@EnableTransactionManagement
public class BookRepositoryImpl implements BookRespository {
	private static Scanner sc=new Scanner(System.in);

	private SessionFactory sessionFactory;

	@Autowired
	public BookRepositoryImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public Book createBook(Book book) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(book);

		return book;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> displayAllBooks() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("select B from Book B", Book.class);
		return query.getResultList();
	}

	@Override
	public Book findById(int id) {
		Session session = sessionFactory.openSession();
		return session.get(Book.class, id);
	}

	@Override
	@Transactional
	public void updateById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Book temp = session.get(Book.class, id);
		
		System.out.println("Enter new book name");
		String nBook=sc.next();
		System.out.println("Enter new price");
		Double nPrice=sc.nextDouble();
		
		temp.setBookName(nBook);
		temp.setBookPrice(nPrice);

		session.merge(temp);
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Book temp1 = session.get(Book.class, id);
		if (temp1 == null) {
			throw new BookNotFound("Book not found.." + id);
		}

		session.remove(temp1);
	}

}
