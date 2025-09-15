package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bean.UserBean;

@Controller
public class UserController {

	@Autowired
	JdbcTemplate stmt;

	@GetMapping("listuser")
	public String listUser(Model model) {

		// select * from users

		List<UserBean> allUsers = stmt.query("select * from users", new BeanPropertyRowMapper<>(UserBean.class));
		//controller -> jsp -> data -> send -> 
		model.addAttribute("allUsers",allUsers);
		return "ListUser";
	}
}
