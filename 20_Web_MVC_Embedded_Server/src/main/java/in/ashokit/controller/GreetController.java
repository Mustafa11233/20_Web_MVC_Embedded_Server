package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class GreetController {
	
	@GetMapping("/greet")
	public String m1(Model model) {
		model.addAttribute("msg","Good Night");
		
		return "index";
	}

}
