package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;
import com.dao.UserDao;

@Controller
public class UserController {

	@Autowired
	UserDao userDao;

	@GetMapping("listuser")
	public String listUser(Model model) {

		// select * from users
		List<UserBean> allUsers = userDao.getAllUsers();

		// controller -> jsp -> data -> send ->
		model.addAttribute("allUsers", allUsers);
		return "ListUser";
	}

	@GetMapping("deleteuser")
	public String deleteUser(Integer userId, Model model) {

		// delete
		// delete from users wehre userId = xx ;
		int status = userDao.deleteUserById(userId);
		return "redirect:/listuser";// url
	}

	@GetMapping("viewuser")
	public String viewUser(Integer userId,Model model) {

		UserBean user = userDao.getUserById(userId);
		model.addAttribute("user",user);
		return "ViewUser";// jsp
	}

	@GetMapping("searchuser")
	public String searchUser() {
		return "SearchUser";
	}
	
	@PostMapping("searchuser")
	public String findUser(String firstName,Model model) {
	List<UserBean> allUsers = 	userDao.searchUserByFirstName(firstName);
		model.addAttribute("allUsers",allUsers);
		return "ListUser";
	}
	
	@GetMapping("edituser")
	public String editUser(Integer userId,Model model) {

		UserBean user = userDao.getUserById(userId);
		model.addAttribute("user",user);
		return "EditUser";
		
	}
	
	@PostMapping("updateuser")
	public String updateUser(UserBean user) {
		userDao.updateUser(user);
		return "redirect:/listuser";//url 
	}
	
	
	
	
	
}
