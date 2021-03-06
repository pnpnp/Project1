package com.lti.mvc.dao;

import java.util.List;

import com.lti.mvc.model.Customer;

public interface ICustomerDao {

	public void addCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);// update/modify

	public List<Customer> listCustomer();// retrieve/listAll

	public Customer getCustomerById(String emailId);// search

	public void removeCustomer(String emailId);// delete/remove
}
