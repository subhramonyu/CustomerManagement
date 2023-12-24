package com.client.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.crm.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>{

}
