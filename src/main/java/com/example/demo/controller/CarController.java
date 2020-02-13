package com.example.demo.controller;


import javax.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Car;
import com.example.demo.repo.CarRepository;

import lombok.Setter;

@Controller
@Setter
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
	
	@GetMapping(path="/addCar")
	public String initForm(Model model) {
		
		model.addAttribute("command", car);
		return "addCar";
	}
	
	@PostMapping(path="/addCar")
	public String onSubmit(@Valid @ModelAttribute("command") Car car) {
		
		carrepo.save(car);
		System.out.println(car);
		return "success";
		
	}
	
//	@GetMapping(path="/payment")
//	public String findAll(Model model) {
////		List<Car> carList=carrepo.findAll();
////		model.addAttribute("carList", carList);
////		System.out.println(carList);
//		return "payment";
//	}
	

}
