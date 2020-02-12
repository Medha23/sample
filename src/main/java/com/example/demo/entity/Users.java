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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	private String userName;
	private long userMobile;
	private String userEmail;
	private String userAddress;
	private String userRole;
	
	
	  @OneToMany
	  @PrimaryKeyJoinColumn(name = "car_id", referencedColumnName = "car_model")
	  private List carList;

//	@OneToMany
//	@JoinTable(name = "car",
//            joinColumns = {@JoinColumn(name = "car_model")})
//	private List<Car> carList;

	//private Car car;
//	
//	@Autowired
//	private Driver driver;
//	
//	@Autowired
//	private Payment payment;
//	
	
	
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
	public long getUserMobile() {
		return userMobile;
	}
	public void setUserMobile(long userMobile) {
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
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userMobile=" + userMobile + ", userEmail="
				+ userEmail + ", userAddress=" + userAddress + ", userRole=" + userRole + "]";
	}
	
	
	
}
