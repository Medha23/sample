package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.entity.LocationEntity;

import com.example.demo.repo.LocationRepository;


@Controller
public class LocationController {
	@Autowired
	private LocationEntity location;
	
	@Autowired
	private LocationRepository locrepo;

	public LocationEntity getLocation() {
		return location;
	}

	public void setLocation(LocationEntity location) {
		this.location = location;
	}

	public LocationRepository getLocrepo() {
		return locrepo;
	}

	public void setLocrepo(LocationRepository locrepo) {
		this.locrepo = locrepo;
	}
	
	
}
