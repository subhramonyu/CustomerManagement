package com.client.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.client.crm.entity.Customer;
import com.client.crm.service.CustomerService;

@Controller
public class CustomerController {

	private CustomerService customerservice;

	public CustomerController(CustomerService customerservice) {
		super();
		this.customerservice = customerservice;
	}

	@RequestMapping("/home")
	public String getHomePage() {
		return "customers";
	}

	@GetMapping("/customers")
	public String listCustomer(Model model) {
		model.addAttribute("customer", customerservice.getAllCustomer());
		return "customers";

	}

	@GetMapping("/customer/new")
	public String createnewCustomer(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "create_customer";
	}

	@PostMapping("/customers")
	public String saveStudent(@ModelAttribute("customer") Customer customer) {
		customerservice.saveCustomer(customer);
		return "redirect:/customers";
	}

	@GetMapping("/customer/edit/{id}")
	public String editCustomer(@PathVariable Long id, Model model) {
		model.addAttribute("customer", customerservice.getCustomerById(id));
		return "edit_customer";
	}

	@PostMapping("/customers/{id}")
	public String updateCustomer(@PathVariable Long id, @ModelAttribute("customer") Customer customer, Model model) {

		Customer existingCustomer = customerservice.getCustomerById(id);
		existingCustomer.setId(id);
		existingCustomer.setFirstName(customer.getFirstName());
		existingCustomer.setLastName(customer.getLastName());
		existingCustomer.setEmail(customer.getEmail());

		customerservice.updateCustomer(existingCustomer);
		return "redirect:/customers";
	}

	@GetMapping("/customer/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		customerservice.deleteCustomerById(id);
		return "redirect:/customers";
	}

}
