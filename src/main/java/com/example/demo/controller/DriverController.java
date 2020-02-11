package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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


}
