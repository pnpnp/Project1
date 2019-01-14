package com.lti.service;

import org.springframework.stereotype.Service;

import com.lti.model.Customer;

@Service
public interface ICustomerService {

	public void addCustomer(Customer customer);
	
}
