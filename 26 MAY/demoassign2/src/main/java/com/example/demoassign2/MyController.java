package com.example.demoassign2;

import java.util.List;

import org.checkerframework.common.reflection.qual.GetClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	@Autowired 
	UserRepository userrepo;
	
	@PostMapping("/registeruser")
	public String registerUser(@ModelAttribute Users user) {
		userrepo.save(user);
		return "index";
		
	}
	
	@PostMapping("/validate")
	public String loginUser(@ModelAttribute Users user) {
		String path="invalid";
		
		List<Users> l1=userrepo.findAll();	
		String usname=user.getUname();
		String pass=user.getPassword();
		for(Users us:l1) {
			if(us.getUname().equals(usname) && us.getPassword().equals(pass)) {
				path="valid";
				break;
			}
		}
		return path;
		
	}
	
	@GetMapping("/newuser")
	public String newUser() {
		return "register";
	}

}
