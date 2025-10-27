package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.EmployeeBean;

@Repository
public class EmployeeDao {

	@Autowired
	JdbcTemplate stmt;

	public void addEmp(EmployeeBean employeeBean) {
		// TODO Auto-generated method stub
		stmt.update("insert into employees (firstName,lastName,email,password,profilePicURL) values (?,?,?,?,?) ",
				employeeBean.getFirstName(), employeeBean.getLastName(), employeeBean.getEmail(),
				employeeBean.getPassword(), employeeBean.getProfilePicURL());
	}

	public List<EmployeeBean> getAllEmployees(){
		return stmt.query("select * from employees", new BeanPropertyRowMapper<>(EmployeeBean.class));
	}
}
