package com.example.demo.service;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.model.Book;

public interface BookService {

	public Book createBook(Book book);
//	public Connection get() throws SQLException;

	public List<Book> displayAllBooks();

	public List<Book> findById(int id);

	public Book updateById(Book b);

	public void deleteById(int id);

}
