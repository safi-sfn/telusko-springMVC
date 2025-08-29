package in.inxod.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import in.inxod.service.IGreetingService;

@Controller
@RequestMapping("/v1")  // Base path: every request to this controller will start with "/v1" / class level mapping
public class GreetingController {

	@Autowired
	IGreetingService service;

    // ----------- First Way -----------
    // Using traditional @RequestMapping with GET method
    // It builds a ModelAndView object (contains both "data" and "view name")
    /*
    @RequestMapping(value="/greet", method=RequestMethod.GET)
    public ModelAndView generateWish1() {
        ModelAndView mav = new ModelAndView();
        String res = service.generateGreeting(); // ask service for greeting text
        mav.addObject("wish", res);             // put greeting inside the model
        mav.setViewName("greet");               // view name = "greet" (maps to greet.jsp/html)
        return mav;                             // send model+view to front-end
    }
    */
	
	
	// Second Way	
    // ----------- Second Way -----------
    // More modern and simpler: use @GetMapping instead of @RequestMapping
    @GetMapping("/greeting")   // Handles GET request: "/v1/greeting"
    public String generateWish1(Model model) {
        String res = service.generateGreeting();   // get greeting message
        model.addAttribute("wish", res);           // put greeting into model
        return "greet";                            // view name (same as above)
    }
	
	
    // ----------- Third Way -----------
    // Instead of Model, we can also use a Map to carry data to the view
    @GetMapping("/greet2")   // Handles GET request: "/v1/greet2"
    public String generateWish1(Map<String,Object> map) {
        String res = service.generateGreeting();   // get greeting message
        map.put("wish", res + " Map");             // add message with suffix to model
        return "greet";                            // go to "greet" view
    }
	
	
    // ----------- Fourth Way -----------
    // Special case: If return type is void, then Spring decides the view name 
    // automatically from the request URL (so we cannot use class-level mapping here).
    /*
    @GetMapping("/greet")   // Handles "/greet"
    public void generateWish2(Map<String,Object> map) {
        String res = service.generateGreeting();
        map.put("wish", res + " Void return type"); // put greeting in model
        return;  // nothing to return, Spring infers the view from the request mapping
    }
    */
	
	
	
}
