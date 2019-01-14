package com.lnt.mvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lnt.mvc.model.Customer;

@Repository
public interface ICustomerDao {

	public void addCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);// update/modify

	public List<Customer> listCustomer();// retrieve/listAll

	public Customer getCustomerById(int customerId);// search

	public void removeCustomer(int customerId);// delete/remove
}
