package com.example.demo.service;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.example.demo.dao.BookDao;
import com.example.demo.model.Book;

@Component
public class BookServiceImpl implements BookService {
	private BookDao bookDaoImpl;
	
	

	public BookServiceImpl(BookDao bookDaoImpl) {
		super();
		this.bookDaoImpl = bookDaoImpl;
	}



	@Override
	public Collection<Book> displayAllBook() {
		return bookDaoImpl.displayAllBook();
	}



	@Override
	public Book createBook(Book book) {
		return bookDaoImpl.createBook(book);
	}



	@Override
	public Book findBookById(Integer id) {
		return bookDaoImpl.findBookById(id);
	}

}
