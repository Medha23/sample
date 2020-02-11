package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")

public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long paymentId;
	private String payMode;
	private double totalFare;
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public double getTotalFare() {
		return totalFare;
	}
	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", payMode=" + payMode + ", totalFare=" + totalFare + "]";
	}
	
	
	
}
