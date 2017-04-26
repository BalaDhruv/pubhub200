package com.bala.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
	
	private static final Logger LOGGER = Logger.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String index(HttpSession session){
		LOGGER.info("Home COntroller Invoked");
		String status = "Login Your Own Account";
		session.setAttribute("success", status);
		return "index";
	}

}
