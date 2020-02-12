package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	
	
	@Id
	@GeneratedValue
	  private long car_id;
	  private String car_model;
	  private String car_Price;

	  public long getCar_id() {
		return car_id;
	}
	public void setCar_id(long car_id) {
		this.car_id = car_id;
	}
	public String getCar_model() {
		return car_model;
	}
	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}
	public String getCar_Price() {
		return car_Price;
	}
	public void setCar_Price(String car_Price) {
		this.car_Price = car_Price;
	}
	
	@Override
	public String toString() {
		return "Car [car_id=" + car_id + ", car_model=" + car_model + ", car_Price=" + car_Price + "]";
	}
	public Car(long car_id, String car_model, String car_Price) {
		super();
		this.car_id = car_id;
		this.car_model = car_model;
		this.car_Price = car_Price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	  
	  
}
