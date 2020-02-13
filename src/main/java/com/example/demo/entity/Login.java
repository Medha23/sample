package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class Login {
	
	@Id
	private long login_id;
	private String username;
	private String password;
	
	
	public long getLogin_id() {
		return login_id;
	}
	public void setLogin_id(long login_id) {
		this.login_id = login_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(long login_id, String username, String password) {
		super();
		this.login_id = login_id;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [login_id=" + login_id + ", username=" + username + ", password=" + password + "]";
	}
	
	
	

}
