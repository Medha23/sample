package com.example.demo.entity;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "LOCATION")
public class LocationEntity{
    @Id
	@GeneratedValue
	private Long id;
	
	private String address;
	
	private String city;
	
	private String postalCode;
	
	private String phone;
	
	private String email;

	
	public LocationEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocationEntity(Long id, String address, String city, String postalCode, String phone, String email) {
		super();
		this.id = id;
		this.address = address;
		this.city = city;
		this.postalCode = postalCode;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "LocationEntity [id=" + id + ", address=" + address + ", city=" + city + ", postalCode=" + postalCode
				+ ", phone=" + phone + ", email=" + email + "]";
	}
	

	
}
