package com.example.demo.entity;




import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "EMPLOYEE")
public class EmployeeEntity {
	

	@Id
	@GeneratedValue
	private long emp_id;
	
	private String name;
	
	private String surname;
	
	public EmployeeEntity() {
	}

	public long getEmp_id() {
		return emp_id;
	}

    public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}



	public EmployeeEntity(long emp_id, String name, String surname) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [emp_id=" + emp_id + ", name=" + name + ", surname=" + surname + "]";
	}
	
	

}