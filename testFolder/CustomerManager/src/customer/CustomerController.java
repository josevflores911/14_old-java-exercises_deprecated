package customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView nav = new ModelAndView("index");
		nav.addObject("message","Hello from Spring MVC");
		return nav;
	}
}
