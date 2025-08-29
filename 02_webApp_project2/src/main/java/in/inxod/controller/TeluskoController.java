package in.inxod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.inxod.service.IGreetingService;

@Controller
@RequestMapping("/v2")  // All requests here will start with "/v2"
public class TeluskoController {
	
	 // Service layer is injected automatically by Spring
	@Autowired
	IGreetingService service;

	// ----------------- Method -----------------
		// When user sends a GET request to "/v2/birthday-wish"
	@GetMapping("/birthday-wish")
	public String generateWish(Model model) {
		
		    String res = service.generateBirthdayWish();
			model.addAttribute("wish",res);
		return "greetBirthday";
	}
	
	// user hits this url :-  http://localhost:8080/v2/birthday-wish
}
