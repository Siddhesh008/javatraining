package com.example.demomvc3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	
	@PostMapping("/createstudent")
	public String createStudent(@ModelAttribute Student student) {
		return "result";
	}

}
