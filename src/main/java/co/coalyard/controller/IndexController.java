package co.coalyard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping(path = {"","/"})
	public String Login(Model model){
		return "index";
	}
}
