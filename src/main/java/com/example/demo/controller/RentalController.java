package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.entity.RentalEntity;

import com.example.demo.repo.RentalRepository;


@Controller
public class RentalController {

	
	@Autowired
	private RentalEntity rental;
	
	@Autowired
	private RentalRepository rentalrepo;

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
	
}
