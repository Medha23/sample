package com.example.demo.entity;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;




@Entity
@Table(name = "RENTAL")
public class RentalEntity{
	

	@Id
	@GeneratedValue
	private Long id;
	
	
	private int cost;
	
	public RentalEntity() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public RentalEntity(Long id, int cost) {
		super();
		this.id = id;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "RentalEntity [id=" + id + ", cost=" + cost + "]";
	}
	
}
