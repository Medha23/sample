package com.example.demo.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Login;

import com.example.demo.repo.LoginRepository;

@Controller
public class LoginController {
	
	@Autowired
	private Login login;
	
	@Autowired
	private LoginRepository loginrepo;
	
	@Autowired
	private ModelAndView mdlView;
	
	@Autowired
	private WelcomeController wlc;
	
	
	@GetMapping(path="/Userdetail")
	public String initForm(Model model) {
		
		model.addAttribute("command", login);
		return "Userdetail";
	}
	
	@PostMapping(path="/Userdetail")
	public String onSubmit(@Valid @ModelAttribute("command") Login login) {
		
		loginrepo.save(login);
		System.out.println(login);
		return "payment";
		
	}
	
	
	
	@GetMapping(path="/adminDetail")
	public String initForm1(Model model) {
		
		model.addAttribute("command", login);
		return "adminDetail";
	}
	
	@PostMapping(path="/adminDetail")
	public String onSubmit1(@Valid @ModelAttribute("command") Login login) {
		
		loginrepo.save(login);
		System.out.println(login);
		return "success";
		
	}

}
