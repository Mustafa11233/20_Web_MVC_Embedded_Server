package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/welcome")
public class MsgController {
	
	@GetMapping("/greet")
	//This method is returning view page
	public String welcomeMsg(Model model) {
		model.addAttribute("msg","Good Evening");
		
		return "index";
	}
	//one method is mapped to multiple url patterns
	@GetMapping(value = {"/","/hi","/hello"})
	@ResponseBody
	//this method is giving direct response
	public String sayHello() {
		String msg="Hello, how are you?";
		
		return msg;
	}

}
