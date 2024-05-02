package com.yash.springdemo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.springdemo.model.Book;
import com.yash.springdemo.respository.BookDao;
import com.yash.springdemo.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;

	@Override
	public boolean createBook(Book book) {
		// TODO Auto-generated method stub
		return bookDao.save(book) != null;
	}

	public Iterable<Book> getAllBooks() {
		return bookDao.findAll();
	}

	public Book getBookById(Long id) {
		try {
			return bookDao.findById(id).get();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean deleteBook(Long id) {
		// TODO Auto-generated method stub
		try {
			bookDao.deleteById(id);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	
	

}
