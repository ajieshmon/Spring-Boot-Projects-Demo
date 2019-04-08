package com.crudmvc.service;

import java.util.List;

import com.crudmvc.model.Book;

public interface BookService {
	public void saveBook(Book book);
	public List<Book> getAllBooks();
	public void removeBook(int id);
	public Book getBookById(int id);

}
