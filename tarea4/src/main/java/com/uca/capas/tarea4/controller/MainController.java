package com.uca.capas.tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;


import com.uca.capas.tarea4.domain.Producto;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/producto")
	public ModelAndView producto()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto",new Producto());
		mav.setViewName("commons/inicio");
		
		
		return mav;
	}
	
	@RequestMapping("/procesar")
	public ModelAndView procesar(@Valid @ModelAttribute Producto producto, BindingResult result)
	{
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors())
		{
			mav.setViewName("commons/inicio");
		}
		else
		{
			mav.addObject("codigo",producto.getCodigo());
			mav.addObject("nombre",producto.getNombre());
			mav.addObject("marca",producto.getMarca());
			mav.addObject("descripcion",producto.getDescripcion());
			mav.addObject("existencias",producto.getExistencias());
			mav.addObject("fecha",producto.getFecha());
			mav.setViewName("commons/resultado");
		}		
		return mav;
	}
}
