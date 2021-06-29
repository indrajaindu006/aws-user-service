package com.example.spring_hibernate_integration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_hibernate_integration.model.Book;
import com.example.spring_hibernate_integration.repository.BookRespository;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRespository bookRepositoryImpl;
	
	

	@Autowired
	public BookServiceImpl(BookRespository bookRepositoryImpl) {
		super();
		this.bookRepositoryImpl = bookRepositoryImpl;
	}

	@Override
	public Book createBook(Book book) {
		return bookRepositoryImpl.createBook(book);
	}

	

	@Override
	public List<Book> displayAllBooks() {
		return bookRepositoryImpl.displayAllBooks();
	}

	@Override
	public Book findById(int id) {
		return bookRepositoryImpl.findById(id);
	}

	@Override
	public void updateById(int id) {
		bookRepositoryImpl.updateById(id);
	}

	@Override
	public void deleteById(int id) {
		bookRepositoryImpl.deleteById(id);
	}

}
