package in.inxod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	
	  /*
     *  What are Path Parameters?
     * ----------------------------
     * - Path parameters are parts of the URL itself.
     * - We define them using curly braces { } in our endpoint.
     * 
     * Example:
     *    http://localhost:8080/inxod/queryparam/user/Imran/Delhi
     *       Here:
     *        - "Imran" will be captured as the name
     *        - "Delhi" will be captured as the city
     * 
     * Difference from Query Parameters:
     *   - Path Parameter: /user/Imran/Delhi
     *   - Query Parameter: /user?name=Imran&city=Delhi
     *   
     *   - @PathVariable is used to grab values directly from the URL path.
     *   - @RequestParam is different → it grabs values from query string like ?key=value
     *   e.g. /user?name=Imran&city=Delhi
     * 
     * - To read path parameters → we use @PathVariable <-- This is compulsory to Add
     * - To read query parameters → we use @RequestParam <-- This is Optional
     */

	
	// This method will run whenever someone sends a GET request to /user/{n}/{c}
    // Example: /user/Imran/Delhi
	@GetMapping("/user/{n}/{c}")
	public String displayMessage(Model model, 
			@PathVariable("n") String name, // "n" in the URL becomes this variable
			@PathVariable("c") String city) // "c" in the URL becomes this variable)
	{
		String response = "Hello " + name + " welcome to The InXod " + city;
		model.addAttribute("info", response);
		return "userInfo";

	}

}








