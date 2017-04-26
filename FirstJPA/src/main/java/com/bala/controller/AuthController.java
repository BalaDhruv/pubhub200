package com.bala.controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bala.model.User;
import com.bala.repository.UserInterface;

@Controller
@RequestMapping("/auth")
public class AuthController {

	private static final Logger LOGGER = Logger.getLogger(AuthController.class);

	@Autowired
	private UserInterface userInterface;

	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap, HttpSession session) {
		LOGGER.info("Entering Login");
		LOGGER.debug(new Object[] { email, password });


		User user = userInterface.findByEmailAndPassword(email, password);
		if (user != null) {
			session.setAttribute("LOGGED_IN_USER", user);
			LOGGER.info("Login Success");
			return "redirect:../books";
		} else {
			LOGGER.error("Login Failure");
			return "failure";
		}
	}
	@GetMapping("register")
	public String callRegister(){
		return "register"; 
	}

	@PostMapping("/checkregister")
	public String register(@RequestParam("username") String username, @RequestParam("email") String email,
			@RequestParam("password") String password,ModelMap modelMap,HttpSession session) {
		LOGGER.info("Entering into register");
		LOGGER.debug(new Object[] { username, email, password });

		String status = "Register Your Own Account";
		User user = new User();
		user.setName(username);
		user.setEmail(email);
		user.setPassword(password);
		if (userInterface.save(user) != null) {
			LOGGER.info("Successfully Registered");
			status = "Registered Successfully";
			session.setAttribute("success", status);
			return "login";
		} else {
			LOGGER.info("Not Registered..Please Try Again");
			status = "Not Registered..Please Try Again";
			session.setAttribute("success", status);
			return "register";
		}
	}

}
