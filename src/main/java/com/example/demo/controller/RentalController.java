package com.example.demo.controller;

import java.sql.Array;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Car;
import com.example.demo.entity.RentalEntity;

import com.example.demo.repo.RentalRepository;

@Controller
public class RentalController {

	@Autowired
	private RentalEntity rental;

	@Autowired
	private RentalRepository rentalrepo;

	@Autowired
	private ModelAndView mdlView;

	@Autowired
	private WelcomeController wlc;

	public RentalEntity getRental() {
		return rental;
	}

	public void setRental(RentalEntity rental) {
		this.rental = rental;
	}

	public RentalRepository getRentalrepo() {
		return rentalrepo;
	}

	public void setRentalrepo(RentalRepository rentalrepo) {
		this.rentalrepo = rentalrepo;
	}

	@GetMapping(path="/payment")
	public String initForm2(Model model) {
		
		model.addAttribute("command", rental);
		return "payment";
	}

@PostMapping(path="/payment")
	public String onSubmit2(@Valid @ModelAttribute("command") RentalEntity rental) {
		
		  final int dist=10; String arr[]= {"Mini","Micro","prime"}; String arr2[]=
		  {"withdriver","withoutdriver"};
		  
		  
		  for(int i=0;i<arr[i].length();i++) {
			  for(int j=0;j<arr2[j].length();j++) {
				  
		  if(i <= j) { if(j==0) { 
			  System.out.println("Mini withDriver : 3000");
			  }
		  
		  System.out.println("Mini withoutDriver: 1000"); }
		  
		  
		  
		  
		  }}
		 
	
	/*public class calculate(String[]a1,String[] a2) {
		
		if (condition) {
			
		} else {

		}
		*/
	}	
	
	
		rentalrepo.save(rental);
		System.out.println(rental);
		return "success";
		
	}}
