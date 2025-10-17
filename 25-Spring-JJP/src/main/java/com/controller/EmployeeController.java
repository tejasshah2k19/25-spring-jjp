package com.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.bean.EmployeeBean;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.dao.EmployeeDao;

@Controller
public class EmployeeController {

	@Autowired
	Cloudinary cloudinary;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	EmployeeDao employeeDao;
	
	@GetMapping("newemp")
	public String newEmp() {

		return "NewEmp";
	}

	@PostMapping("addEmployee")
	public String saveEmp(EmployeeBean employeeBean, MultipartFile profilePic) {

		System.out.println(employeeBean.getFirstName());
		System.out.println(profilePic.getOriginalFilename());
		System.out.println(profilePic.getContentType());

		if (profilePic.getContentType().toLowerCase().contains("png")
				|| profilePic.getContentType().toLowerCase().contains("jpg")
				|| profilePic.getContentType().toLowerCase().contains("jpeg")) {
			//upload 
			
			try {
			
			Map map=	cloudinary.uploader().upload(profilePic.getBytes(), ObjectUtils.asMap("folder", "jjp/"));
			
			String profilePicURL  = (String)map.get("secure_url");
			employeeBean.setProfilePicURL(profilePicURL); 
			employeeBean.setPassword(passwordEncoder.encode(employeeBean.getPassword()));
			
			employeeDao.addEmp(employeeBean); 
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else {

			return "NewEmp";
		}

		return "Login";
	}
}
