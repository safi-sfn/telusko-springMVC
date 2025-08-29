package in.inxod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.inxod.model.Course;

@Controller
@RequestMapping("/buyCourse")
public class CourseController {

	// Handles GET requests to "/buyCourse/course-info"
	@GetMapping("/course-info")
	public String courseInfo(Model model) {
		Course cors = new Course();
		// Setting up some dummy course details
		cors.setcId(12); // Course ID
		cors.setcName("Spring AI"); // Course name
		cors.setcCost(5999.0); // Course cost

		// Add course object into the model
		// "courses" → key (the name you'll use inside the HTML/JSP page)
		// cors → value (the actual Course object with data)
		//
		// Purpose: Passes data from backend (Java) to frontend (View template)
		// Example: In a Thymeleaf/ JSP page, you can access it as ${courses}
		model.addAttribute("courses", cors);

		return "Course";
	}

	// Handles GET requests to "/buyCourse/course-desc"
	@GetMapping("/course-desc")
	public String courseDesc(Model model) {

		// Creating an array of strings (course modules/content)
		String cDesc[] = new String[] { "Spring core", "spring MVC", "spring data JPA" };

		// Add this array to the model so it can be displayed in the view
		model.addAttribute("content", cDesc);
		return "courseContent";
	}
}
