package com.bean;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeBean {

	Integer employeeId;
	String firstName;
	String lastName;
	String email;
	String password;
	String profilePicURL;

}
