package com.thefundidors.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.thefundidors.springboot.web.app.models.Usuario;

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
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Sergio");
		usuario.setApellidos("Hernandez Jerez");
		usuario.setEmail("telkj@lfkj.com");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: " .concat(usuario.getNombre()));
		return "perfil";
		
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de usuairos:");

		return "listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Sergio", "Hernandez", "sergio@sergio.com"));
		usuarios.add(new Usuario("Estel", "Guardiola", "estel@estel.com"));
		usuarios.add(new Usuario("Vega", "Hernandez", "vega@vega.com"));
		usuarios.add(new Usuario("Deneb", "Hernandez", "deneb@deneb.com"));
		usuarios.add(new Usuario("Altair", "Hernandez", "altair@altair.com"));
		return usuarios;
		
	}
}
