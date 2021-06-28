package com.example.demo.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.example.demo.model.Book;

public interface BookDao {

	public Book createBook(Book book);

	public List<Book> displayAllBooks();

	public List<Book> findById(int id);

	public Book updateById(Book b);

	public void deleteById(int id);

//	public Connection getMyConnection() throws SQLException;

}
