package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService cs;
	
	@GetMapping("display")
	public List<Customer> displayCustomers(){
		return cs.display();
	}
	
	@PostMapping("add")
	public void addCustomer(Customer c) {
		cs.add(c);
	}
}
