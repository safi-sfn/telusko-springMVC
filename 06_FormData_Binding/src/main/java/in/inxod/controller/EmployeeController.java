package in.inxod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.inxod.model.Employee;

@Controller
@RequestMapping("/employee")   // Base URL: anything starting with "/employee" will come here
public class EmployeeController {

	
	// This method handles GET requests to "/employee/registration"
    // Example: http://localhost:8080/employee/registration
	@GetMapping("/registration")
	public String getHomePage() {
	     
		// This will show the registration page where the user can fill details
		return "register";
	}
	
	
    // This method handles POST requests to "/employee/save"
    // Example: when user submits the registration form
	@PostMapping("/save")
	public String registerEmployee(Model model,Employee employee) {
//		System.out.println(employee);
		
		 // Add the submitted employee object into the model
        // This makes it available in the view (e.g., employeeSuccess.jsp can display the data)
		 model.addAttribute("emp", employee);
		 
		// After saving, show the success page
		return "employeeSuccess";
	}
}
