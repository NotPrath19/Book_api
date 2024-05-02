package com.yash.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.springdemo.model.Book;
import com.yash.springdemo.service.BookService;

@RestController
@RequestMapping("/books")
@CrossOrigin("*")
public class BookController {

	@Autowired
	BookService bookService;

	@PostMapping("/add")
	public boolean addBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	
	@GetMapping("/get")
	public Iterable<Book> getbooks()
	{
		return bookService.getAllBooks();
	}
	@GetMapping("/getbook/{id}")
	public Book getBook(@PathVariable("id") Long id)
	{
		return bookService.getBookById(id);
	}
    @PostMapping("/delete")
    public boolean delete(@RequestBody Long id)
    {
    	return bookService.deleteBook(id);
    }
    
}
