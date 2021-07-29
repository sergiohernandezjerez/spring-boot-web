package com.thefundidors.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework");
		return "index";
	}
	
	@GetMapping("/indexModelMap")
	public String index(ModelMap model) {
		model.addAttribute("titulo", "Hola Spring Framework con ModelMap");
		return "indexModelMap";
	}
	
	@GetMapping("/indexMap")
	public String indexMap(Map<String, Object> map) {
		map.put("titulo", "Hola Spring Framework Map");
		return "indexMap";
	}
	
	@GetMapping("/indexModelAndView")
	public ModelAndView indexModelAndView(ModelAndView mv) {
		mv.addObject("titulo", "Hola Spring Framework con modelandview");
		mv.setViewName("indexModelAndView");
		return mv;
	}

}
