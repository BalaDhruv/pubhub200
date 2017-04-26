package com.bala.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bala.model.Book;
import com.bala.repository.BookInterface;

@Controller
@RequestMapping("/books")
public class BookController {
	
	private static final Logger LOGGER = Logger.getLogger(BookController.class);

	@Autowired
	private BookInterface bookInterface;
	
	@GetMapping
	public String list(ModelMap modelMap,HttpSession session){
		LOGGER.info("Entering Into Book List");
		List<Book> book = bookInterface.findAll();
		session.setAttribute("books", book);
		return "book/list";
	}
}
