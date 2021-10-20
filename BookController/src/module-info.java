package br.com.andersonchoren.controller;

import org.springframework.stereotype.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	@GetMapping
	public String home() {
		return "home";
	}
}