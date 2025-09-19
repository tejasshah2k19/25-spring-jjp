package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;
import com.dao.UserDao;

@Controller
public class SessionController {

	@Autowired
	UserDao userDao;

	@GetMapping("signup")
	public String signup() {
		return "Signup"; // name of jsp
	}

	@GetMapping("login")
	public String login() {
		return "Login";
	}

//	@PostMapping("saveuser")
//	public String saveUser(String firstName, String lastName, String email, String password) {
//		// read
//		System.out.println(firstName);
//		System.out.println(lastName);
//		System.out.println(email);
//		System.out.println(password);
//		return "Login";
//	}

	// MVC
	@PostMapping("saveuser")
	public String saveUser(@Validated UserBean user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("result", result);
			System.out.println(result.getAllErrors());
			return "Signup";
		} else {
			System.out.println(user.getFirstName());
			System.out.println(user.getLastName());
			System.out.println(user.getPassword());
			System.out.println(user.getEmail());

			userDao.addUser(user);
			return "Login";
		}
	}

}
