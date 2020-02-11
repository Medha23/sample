package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

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
	
	

	

}
