package com.bean;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserBean {
	
	
	private Integer userId; 
	
	@NotBlank(message = "Please Enter FirstName")
	//alphabets 
	private String firstName;

	@NotBlank(message = "Please Enter LastName")
	//alphabets 
	private String lastName;

	@NotBlank(message="Please Enter Email")
	@Pattern(regexp = "[a-zA-Z]+@[a-zA-Z]+\\.[a-zA-Z]+",message = "Please Enter Valid Email")
	private String email;

	//XXX@XXX.com 
	
	@NotBlank(message = "Please Enter Password")
	@Length(min=8,message = "Password Should have min 8 characters")
	@Length(max=50,message = "Password can have max 50 chracters")
	private String password;

	
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
