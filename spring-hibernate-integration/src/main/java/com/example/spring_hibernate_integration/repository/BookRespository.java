package com.example.spring_hibernate_integration.repository;

import java.util.List;

import com.example.spring_hibernate_integration.model.Book;

public interface BookRespository {

	public Book createBook(Book book);


	public List<Book> displayAllBooks();


	public Book findById(int id);


	public void updateById(int b);


	public void deleteById(int id);
}