package com.thefundidors.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/forward") 
	public String homeForward() {
		return "forward:/app/index"; //no cambia la url del navegador. Solo utilizar para rutas internas del projecto
	}
	
	@GetMapping("/redirect")
	public String homeRedirect() {
		return "redirect:/app/index"; //cambia la url del navegador
	}


}
