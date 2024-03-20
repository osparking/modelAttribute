package space.bum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {
	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@GetMapping("/a")
	public String showHomeA(Model model) {
		model.addAttribute("prefix", "A 오케이");
		return "home";
	}

	@ModelAttribute
	public void setMessage(Model model) {
		model.addAttribute("message", "야 기분좋다");
	}
}
