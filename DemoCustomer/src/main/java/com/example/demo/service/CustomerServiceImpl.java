package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	private CustomerRepository cr;
	
	@Override
	public void add(Customer c) {
		// TODO Auto-generated method stub
			cr.save(c);

	}

	@Override
	public List<Customer> display() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

}
