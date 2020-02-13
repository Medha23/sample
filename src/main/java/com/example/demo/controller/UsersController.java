package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	
	@Autowired
	private WelcomeController wlc;
	
	@Autowired
	private ModelAndView mdlView;

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
	public String initForm(Model model) {
		
		model.addAttribute("command", user);
		return "addUser";
	}
	
	@PostMapping(path="/addUser")
	public String onSubmit(@Valid @ModelAttribute("command") Users user) {
		
		userrepo.save(user);
		System.out.println(user);
		return "success";
		
	}
}
