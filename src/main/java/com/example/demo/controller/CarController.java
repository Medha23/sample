package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Car;
import com.example.demo.repo.CarRepository;

@Controller
public class CarController {
	
	private static final String Carrepo = null;

	@Autowired
	private Car car;
	
	@Autowired
	private CarRepository carrepo;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public CarRepository getCarrepo() {
		return carrepo;
	}

	public void setCarrepo(CarRepository carrepo) {
		this.carrepo = carrepo;
	}
	
	
	@GetMapping(path="/addCar")
	public String addTrip() {
		
//		this.trip.getClientList().add(ram);
//		this.trip.getClientList().add(shyam);
		
		System.out.println(this.carrepo.findById(2010L));
		
		
		return "success";
	}
	
	

}
