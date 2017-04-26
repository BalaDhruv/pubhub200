package com.bala.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bala.model.User;
import com.bala.repository.StudentInterface;

@Controller
@RequestMapping("/auth")
public class AuthController {

	private static final Logger LOGGER = Logger.getLogger(AuthController.class);

	@Autowired
	private StudentInterface stuInterface;

	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap, HttpSession session) {
		LOGGER.info("Entering Login");
		LOGGER.debug(new Object[] { email, password });

		User user = stuInterface.findByEmailAndPassword(email, password);
		if (user != null) {
			List<User> u = stuInterface.findAll();
			session.setAttribute("LOGGED_IN_USER", u);
			LOGGER.info("Login Success");
			return "success";
		} else {
			LOGGER.error("Login Failure");
			return "failure";
		}
	}

}
