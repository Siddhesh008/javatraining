package com.example.demoasg1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	
	@Autowired
	EmpRepository emprepo;
@PostMapping("/createemployee")
public String createEmployee(@ModelAttribute Employee emp) {
	emprepo.save(emp);
	
	return "index";
}
@GetMapping("/showall")
public String show(Model model) {
	List<Employee> ob=emprepo.findAll();
	model.addAttribute("employee",ob);
	return "result";
}

}
