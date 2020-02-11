package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.entity.Car;
import com.example.demo.repo.CarRepository;

@Controller
public class CarController {
	
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
	

}
