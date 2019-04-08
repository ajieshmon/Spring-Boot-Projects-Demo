package com.crudmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.crudmvc.model.Book;
import com.crudmvc.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/")
	public ModelAndView homePage()
	{
		return new ModelAndView("Welcome");
	}
	
	@GetMapping("/addBook")
	public ModelAndView addNewBook()
	{	
		return new ModelAndView("AddBook");
	}
	
	@GetMapping("/getBook")
	public ModelAndView getAllBook(Model model)
	{
		model.addAttribute("allBook",bookService.getAllBooks());
		return new ModelAndView("ViewBook");
	}
	
	@PostMapping("/saveBook")
	public ModelAndView saveNewBook(@ModelAttribute("book") Book book)
	{
		bookService.saveBook(book);
		return new ModelAndView("redirect:/getBook");
	}
	
	@GetMapping("/deleteBook/{id}")
	public ModelAndView deleteSingleBook(@PathVariable int id)
	{
		bookService.removeBook(id);
		return new ModelAndView("redirect:/getBook");
		
	}
	
	@GetMapping("/editBook/{id}")
	public ModelAndView editSingleBook(@PathVariable int id,Model model)
	{
		Book book=bookService.getBookById(id);
		model.addAttribute("bookInfo", book);
		return new ModelAndView("EditBook");	
	}
}
