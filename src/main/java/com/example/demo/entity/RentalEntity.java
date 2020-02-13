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
	private long id;
	
	
	private int cost;
	
	public RentalEntity() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public RentalEntity(long id, int cost) {
		super();
		this.id = id;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "RentalEntity [id=" + id + ", cost=" + cost + "]";
	}
	
}
