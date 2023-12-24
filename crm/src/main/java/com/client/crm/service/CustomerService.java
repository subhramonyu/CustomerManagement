package com.client.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.client.crm.entity.Customer;
import com.client.crm.repository.CustomerRepository;

@Service
public class CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerService(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
	
	public List<Customer> getAllCustomer(){
		return customerRepository.findAll();
	}
	
	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer getCustomerById(Long id) {
		return customerRepository.getById(id);
		}
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	public void deleteCustomerById(Long id) {
		 customerRepository.deleteById(id);
	}
	
}
