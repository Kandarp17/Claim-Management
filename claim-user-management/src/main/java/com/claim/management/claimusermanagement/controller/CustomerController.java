package com.claim.management.claimusermanagement.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.claim.management.claimusermanagement.entity.Customer;
import com.claim.management.claimusermanagement.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/{id}")
	public Optional<Customer> getCustomer(@PathVariable int id){
		return customerRepository.findById(id);
	}
	

	
}
