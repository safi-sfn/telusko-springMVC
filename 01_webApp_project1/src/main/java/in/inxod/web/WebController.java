package in.inxod.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {

	@RequestMapping("/welcome")
	public ModelAndView displayInfo() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", "Hello Welcome to InXod");
		mav.setViewName("index");
		return mav;
	}
}
