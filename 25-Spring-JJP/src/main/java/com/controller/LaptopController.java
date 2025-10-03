package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.LaptopBean;

@Controller
public class LaptopController {

	@GetMapping("newlaptop")
	public String newLaptop() {
		return "NewLaptop";
	}

	@PostMapping("savelaptop")
	public String saveLaptop(@Validated LaptopBean laptopBean, BindingResult result,Model model) {
		// read -> bean
		// validate
		if (result.hasErrors()) {
			model.addAttribute("result",result);
			return "NewLaptop";
		} else {
			// insert
			return "NewLaptop";
		}
	}
}
