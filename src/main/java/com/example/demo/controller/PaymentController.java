package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.entity.Payment;
import com.example.demo.repo.PaymentRepository;

@Controller
public class PaymentController {
	
	@Autowired
	private Payment payment;

	@Autowired
	private PaymentRepository paymentrepo;

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public PaymentRepository getPaymentrepo() {
		return paymentrepo;
	}

	public void setPaymentrepo(PaymentRepository paymentrepo) {
		this.paymentrepo = paymentrepo;
	}
	
	
	
}
