package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Car;
import com.example.demo.entity.Driver;

import com.example.demo.repo.DriverRepository;

@Controller
public class DriverController {
	
	@Autowired
	private Driver driver;
	
	@Autowired
	private DriverRepository driverrepo;

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public DriverRepository getDriverrepo() {
		return driverrepo;
	}

	public void setDriverrepo(DriverRepository driverrepo) {
		this.driverrepo = driverrepo;
	}
	
	
	@GetMapping(path="/addDriver")
	public String addDriver() {
		
//		this.trip.getClientList().add(ram);
//		this.trip.getClientList().add(shyam);
		
		System.out.println(this.driverrepo.findById(2010L));
		return "success";
	}
	
	@PostMapping(path="/addDriver")
	public String onSubmit(@Valid @ModelAttribute("command") Driver driver) {
		
		driverrepo.save(driver);
		System.out.println(driver);
		return "success";
		
	}


}
