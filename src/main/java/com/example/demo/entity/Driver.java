package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.enums.DriverEnum;



@Entity
@Table(name="driver")
public class Driver {
	
	@Id
	@GeneratedValue
	private long driverId;
	private String driverName;
	private long driverMobile;
	private String driverEmail;
	private String driverAddress;
	private double rating;
	private double driverPrice;
	
	
	@Enumerated(EnumType.STRING) 
	private DriverEnum driverenum;
	
	
	public DriverEnum getDriverenum() {
		return driverenum;
	}
	public void setDriverenum(DriverEnum driverenum) {
		this.driverenum = driverenum;
	}
	public long getDriverId() {
		return driverId;
	}
	public void setDriverId(long driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public long getDriverMobile() {
		return driverMobile;
	}
	public void setDriverMobile(long driverMobile) {
		this.driverMobile = driverMobile;
	}
	public String getDriverEmail() {
		return driverEmail;
	}
	public void setDriverEmail(String driverEmail) {
		this.driverEmail = driverEmail;
	}
	public String getDriverAddress() {
		return driverAddress;
	}
	public void setDriverAddress(String driverAddress) {
		this.driverAddress = driverAddress;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public double getDriverPrice() {
		return driverPrice;
	}
	public void setDriverPrice(double driverPrice) {
		this.driverPrice = driverPrice;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", driverMobile=" + driverMobile
				+ ", driverEmail=" + driverEmail + ", driverAddress=" + driverAddress + ", rating=" + rating
				+ ", driverPrice=" + driverPrice + "]";
	}
	public Driver(long driverId, String driverName, long driverMobile, String driverEmail, String driverAddress,
			double rating, double driverPrice) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverMobile = driverMobile;
		this.driverEmail = driverEmail;
		this.driverAddress = driverAddress;
		this.rating = rating;
		this.driverPrice = driverPrice;
	}
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
