package in.inxod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	
    /*
     * Query Parameter:
     * ----------------
     * Sending data from client → server through the URL after "?key=value"
     * Example: http://localhost:8080/inxod/queryparam/user?n=Imran   <-- Single Parameter
     * Example: http://localhost:8080/inxod/queryparam/user?n=Safi&c=Muger  <-- Multiple Parameter use(?key1=value1&key2=value2)
     * 
     * - @RequestParam("n") is used to bind the query parameter 'n' to a Java method argument.
     * - The "key" in RequestParam("") must match the query parameter name in the URL.
     * - It's not mandatory to use @RequestParam if the variable name matches, but it's good practice.
     */

	// For Single Parameter
/*	
	@GetMapping("/user")
//	public String displayMessage(String name,Model model)  //  <-- this also works without @RequestParam if variable name matches
	public String displayMessage(@RequestParam("n")String name,Model model) {
		
		String response = "Hello "+name+" welcome to The InXod";
		model.addAttribute("info", response);
		return "userInfo";
	
	}
*/
	
@GetMapping("/user")
public String displayMessage(Model model, @RequestParam("n") String name, @RequestParam("c") String city) {

	String response = "Hello " + name + " welcome to The InXod " + city;
	model.addAttribute("info", response);
	return "userInfo";

}
	

}








