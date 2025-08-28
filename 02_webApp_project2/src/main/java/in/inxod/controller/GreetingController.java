package in.inxod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import in.inxod.service.IGreetingService;

@Controller
public class GreetingController {

	@Autowired
	IGreetingService service;

	// First Way
//	@RequestMapping(value="/greet", method=RequestMethod.GET)
//	public ModelAndView generateWish1() {
//		ModelAndView mav = new ModelAndView();
//		String res = service.generateGreeting();
//		mav.addObject("wish", res);
//		mav.setViewName("greet");
//		return mav;
//	}
	
	
	// Second Way	
	@GetMapping("/greet")
	public String generateWish1(Model model) {
		
		    String res = service.generateGreeting();
			model.addAttribute("wish",res);
		return "greet";
	}
	
}
