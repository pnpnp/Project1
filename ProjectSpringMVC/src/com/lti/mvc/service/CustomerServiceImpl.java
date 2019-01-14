package com.lti.mvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.mvc.dao.ICustomerDao;
import com.lti.mvc.model.Customer;

public class CustomerServiceImpl implements ICustomerService {

	private ICustomerDao customerDao;

	// setter method for personDao
	@Autowired
	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	
	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		this.customerDao.addCustomer(customer);
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		this.customerDao.updateCustomer(customer);

	}

	@Override
	@Transactional
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		return this.customerDao.listCustomer();
	}

	@Override
	public Customer getCustomerById(String emailId) {
		return this.customerDao.getCustomerById(emailId);
	}

	@Override
	@Transactional
	public void removeCustomer(String emailId) {
		this.customerDao.removeCustomer(emailId);

	}

}
