package com.unla.grupo12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.grupo12.helpers.ViewRouteHelper;


@Controller
@RequestMapping("/permiso")
public class PermisoController {

	
	@GetMapping("")
	public String index() {
		
		
		return ViewRouteHelper.PERMISO_AGREGAR;
	}
	
}


