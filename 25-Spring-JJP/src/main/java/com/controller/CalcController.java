package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalcController {

	@GetMapping("inputcalc")
	public String inputCalc() {
		return "InputCalc";
	}

	@PostMapping("calc")
	public String calc(Integer n1, Integer n2,Model model) {
		System.out.println(n1+n2); 
		model.addAttribute("ans",n1+n2);
		return "InputCalc";
	}

}
