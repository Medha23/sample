package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.mapping.List;

@Entity

@Table(name="Users")
public class Users {

	@Id
	@GeneratedValue
	private long  userId;
	private String userName;
	private String userMobile;
	private String userEmail;
	private String userAddress;
	private String userRole;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(long userId, String userName, String userMobile, String userEmail, String userAddress,
			String userRole) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMobile = userMobile;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userRole = userRole;
	}

	
}
