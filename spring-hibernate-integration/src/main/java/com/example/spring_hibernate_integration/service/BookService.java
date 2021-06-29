package com.example.spring_hibernate_integration.service;

import java.util.List;

import com.example.spring_hibernate_integration.model.Book;

public interface BookService {
	public Book createBook(Book book);


	public List<Book> displayAllBooks();


	public Book findById(int id);


	public void updateById(int id);


	public void deleteById(int id);

}
