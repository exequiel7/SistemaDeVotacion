package net.spring.app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class HomeController {

	
	@RequestMapping(value="/home", method=RequestMethod.GET) //peticiones tipo GET
	public String goHome(){
		return "home";
	}
	
//	@RequestMapping(value="/detail", method=RequestMethod.GET)
//	public String mostrarDetalle(Model model, @RequestParam("idMovie") int idPelicula, @RequestParam("fecha") String fecha) {
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String mostrarDetalle(Model model) {	
		String nombre = "pepe";
		String apellido = "argento";
		model.addAttribute("nombre", nombre);
		
//		TODO - BUSCAR en la base de datos los horarios
		
		return "detalle";
		
	}
}
