package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;
import com.example.demo.model.BookRowMapper;

@Repository
public class BookDaoImpl implements BookDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public BookDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Book createBook(Book book) {

		int count = jdbcTemplate.update("insert into book(book_id,book_name,book_price) values(?,?,?)",
				book.getBookId(), book.getBookName(), book.getBookPrice());
		System.out.format("%d rows inserted", count);
		return book;
	}

	@Override
	public List<Book> displayAllBooks() {
		List<Book> books = jdbcTemplate.query("select * from book", new BeanPropertyRowMapper<Book>(Book.class));
		return books;
	}

	@Override
	public List<Book> findById(int id) {
		List<Book> book=jdbcTemplate.query("select * from book where book_id='"+id+"'",new BookRowMapper());
		return book;
	}

	@Override
	public Book updateById(Book b) {
		int num=b.getBookId();
		String name=b.getBookName();
		double price=b.getBookPrice();
//	jdbcTemplate.update("update book where book_id='"+num+"'", new BookRowMapper());
	
	String updateQuery = "update book set book_name = ? where book_id = ?";
	jdbcTemplate.update(updateQuery, name, num);
	return b;
					
	}

	@Override
	public void deleteById(int id) {
		
		jdbcTemplate.update("delete from book where book_id='"+id+"'");
	}

//	private DataSource dataSource;
//
//	@Autowired
//	public BookDaoImpl(DataSource dataSource) {
//		super();
//		this.dataSource = dataSource;
//	}

//	@Override
//	public Connection getMyConnection() throws SQLException {
//		Connection connection = dataSource.getConnection();
//		return connection;
//	}

}
