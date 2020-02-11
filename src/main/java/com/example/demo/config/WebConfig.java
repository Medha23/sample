package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Car;
import com.example.demo.entity.Driver;
import com.example.demo.entity.Payment;
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
	public Payment payment() {
		return new Payment();
	}
	
	@Bean
	public Users users() {
		return new Users();
	}
	
	
	
}
