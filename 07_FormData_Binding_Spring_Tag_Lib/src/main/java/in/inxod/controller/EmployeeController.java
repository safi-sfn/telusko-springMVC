package in.inxod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.inxod.model.Employee;

@Controller
@RequestMapping("/employee")   // Base URL: anything starting with "/employee" will come here
public class EmployeeController {


	@GetMapping("/registration")
	public String getHomePage(@ModelAttribute("emp")Employee employee) {
	 
		return "register";
	}
	
	@PostMapping("/registration")
	public String registerEmployee(Model model, @ModelAttribute("emp")Employee employee) {

		 model.addAttribute("emp", employee);
		return "employeeSuccess";
	}
}
