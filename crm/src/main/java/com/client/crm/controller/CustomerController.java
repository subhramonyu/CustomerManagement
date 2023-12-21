package com.client.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.client.crm.entity.Customer;

@Controller
public class CustomerController {

	@RequestMapping("/home")
	public String getHomePage() {
		return "customer";
	}
	
	@GetMapping("/Customer/new")
	public String createnewCustomer() {
		Customer customer = new Customer();
		return "create_customer";
	}

}
