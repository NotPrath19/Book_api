package com.yash.springdemo.service;

import com.yash.springdemo.model.Book;

public interface BookService {
	boolean createBook(Book book);
	Iterable<Book> getAllBooks();
	Book getBookById(Long id);
	boolean deleteBook(Long id);
}
