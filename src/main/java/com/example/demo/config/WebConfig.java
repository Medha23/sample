package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Car;
import com.example.demo.entity.Driver;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.entity.LocationEntity;
import com.example.demo.entity.Login;
import com.example.demo.entity.RentalEntity;
import com.example.demo.entity.Users;

@Configuration
public class WebConfig {

	
	
	@Bean
	public ModelAndView mdlView() {
		return new ModelAndView();
	}
	
	@Bean
	public Car car() {
		return new Car();
	}
	
	@Bean
	public Driver driver() {
		return new Driver();
	}
	
	
	@Bean
	public Users users() {
		return new Users();
	}
	
	@Bean 
	public EmployeeEntity employeeEntity() {
		return new EmployeeEntity();
	}
	
	@Bean
	public LocationEntity locationEntity() {
		
		return new LocationEntity();
	}
	
	
	@Bean 
	public RentalEntity rentalEntity()  {
		return new RentalEntity();
	}
	
	@Bean 
	public Login login()  {
		return new Login();
	}
	
}
