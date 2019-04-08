package com.crudmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudmvc.model.Book;
import com.crudmvc.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	@Transactional
	public void removeBook(int id) {
		Book book=bookRepository.findById(id).orElse(null);
		bookRepository.delete(book);//Delete
		
	}
	@Override
	@Transactional
	public void saveBook(Book book) {
		bookRepository.save(book);//Save and Update
	}
	
	@Override
	@Transactional
	public List<Book> getAllBooks() {
		return(bookRepository.findAll());//Get All Details
	}
	
	@Override
	@Transactional
	public Book getBookById(int id) {
		//Get Details by Id
		return (bookRepository.findById(id).orElse(null));
	}
}
