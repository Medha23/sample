package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class WelcomeController {

	
	@Autowired
	private ModelAndView mdlView;
	
	@GetMapping("/")
	public ModelAndView init() {
		mdlView.setViewName("index");
		mdlView.addObject("mainHeading", "Car Rental Service");
		return mdlView;
	}
	
	
}
