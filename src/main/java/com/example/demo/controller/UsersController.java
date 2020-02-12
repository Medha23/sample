package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Car;
import com.example.demo.entity.Users;
import com.example.demo.repo.CarRepository;
import com.example.demo.repo.UsersRepository;


@Controller
public class UsersController {

	@Autowired
	private Users user;
	
	@Autowired
	private UsersRepository userrepo;

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public UsersRepository getUserrepo() {
		return userrepo;
	}

	public void setUserrepo(UsersRepository userrepo) {
		this.userrepo = userrepo;
	}
	
	@GetMapping(path="/addUser")
	public String addUser() {
		

		//System.out.println(this.userrepo.findById());
		this.userrepo.save(user);
		return "addUser";
	}
	
	
	
	@PostMapping(path="/addUser")
	public String onSubmit(@ModelAttribute("command") Users user) {
		
		userrepo.save(user);
		System.out.println(user);
		return "success";
		
		
//		userrepo.save(user);
//		System.out.println(user);
//		return "addUser";
		
	}
	
	
	
//	@PostMapping(path="/addTrip")//called on submission of a form
//	public String onSubmit(@Valid @ModelAttribute("command") Tour tour,BindingResult result) {
//
//	String nextpage="failure";
//	if(result.hasErrors()) {
//	nextpage="addTrips";}
//	else
//	{
//
//	long row=this.dao.add(tour);
//	if(row==1) {
//	nextpage= "success";}}
//	return nextpage;
//	}
	
	

	

}
