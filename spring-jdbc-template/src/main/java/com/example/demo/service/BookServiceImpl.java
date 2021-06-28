package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BookDao;
import com.example.demo.model.Book;

@Service
public class BookServiceImpl implements BookService {


	private BookDao bookDaoImpl;

	@Autowired
	public BookServiceImpl(BookDao bookDaoImpl) {
		super();
		this.bookDaoImpl = bookDaoImpl;
	}

	@Override
	public Book createBook(Book book) {
		return bookDaoImpl.createBook(book);
	}

	@Override
	public List<Book> displayAllBooks() {
		return bookDaoImpl.displayAllBooks();
	}

	@Override
	public List<Book> findById(int id) {
		return bookDaoImpl.findById(id);
	}

	@Override
	public Book updateById(Book b) {
		
		return bookDaoImpl.updateById(b);
		
	}

	@Override
	public void deleteById(int id) {
		bookDaoImpl.deleteById(id);
	}


//	@SuppressWarnings("resource")
//	ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//	BookDao bookDao = context.getBean("bookDaoImpl", BookDaoImpl.class);
//	public Connection get() throws SQLException {
//		return bookDao.getMyConnection();
//		
//	}
//	@Override
//	public Connection get() throws SQLException {
//		return bookDao.getMyConnection();
//	}
	


}
