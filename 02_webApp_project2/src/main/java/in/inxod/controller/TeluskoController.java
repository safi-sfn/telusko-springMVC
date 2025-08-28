package in.inxod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.inxod.service.IGreetingService;

@Controller
@RequestMapping("/v2")
public class TeluskoController {
	
	@Autowired
	IGreetingService service;

	@GetMapping("/greetBirthday")
	public String generateWish(Model model) {
		
		    String res = service.generateBirthdayWish();
			model.addAttribute("wish",res);
		return "birthday";
	}
}
