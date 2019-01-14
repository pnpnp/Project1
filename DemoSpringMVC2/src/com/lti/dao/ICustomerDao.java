package com.lti.dao;

import org.springframework.stereotype.Repository;

import com.lti.model.Customer;

@Repository
public interface ICustomerDao {

	public void addCustomer(Customer customer);
	
}
