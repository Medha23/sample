package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.entity.EmployeeEntity;

import com.example.demo.repo.EmployeeRepository;


@Controller
public class EmployeeController {

	
	@Autowired
	private EmployeeEntity employee;
	
	@Autowired
	private EmployeeRepository employeerepo;

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}

	public EmployeeRepository getEmployeerepo() {
		return employeerepo;
	}

	public void setEmployeerepo(EmployeeRepository employeerepo) {
		this.employeerepo = employeerepo;
	}
	
}
