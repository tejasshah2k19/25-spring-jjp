package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {

	@Autowired
	JdbcTemplate stmt;// C o = new C();//10 -> singleton design -> class -> 1 object

	public void addUser(UserBean user) {
		stmt.update("insert into users (firstName,lastName,email,password) values (?,?,?,?)", user.getFirstName(),
				user.getLastName(), user.getEmail(), user.getPassword());
	}

	// get all users
	public List<UserBean> getAllUsers() {
		List<UserBean> allUsers = stmt.query("select * from users", new BeanPropertyRowMapper<>(UserBean.class));
		return allUsers;
	}

	// delete
	public int deleteUserById(Integer userId) {
		return stmt.update("delete from users where userId = ?", userId);
	}

	// get user by id
	public UserBean getUserById(Integer userId) {
		UserBean user = stmt.queryForObject("select * from users where userId = ? ",
				new BeanPropertyRowMapper<>(UserBean.class), userId);
		return user;
	}

	public List<UserBean> searchUserByFirstName(String firstName) {
		List<UserBean> allUsers = stmt.query("select * from users where firstName like ?",
				new BeanPropertyRowMapper<>(UserBean.class), "%" + firstName + "%");
		return allUsers;
	}

	public void updateUser(UserBean user) {
		stmt.update("update users set firstName = ? , lastName = ? where userId = ?", user.getFirstName(),
				user.getLastName(), user.getUserId());
	}

	// search

}
