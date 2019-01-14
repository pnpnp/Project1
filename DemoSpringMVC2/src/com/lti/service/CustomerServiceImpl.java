package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.ICustomerDao;
import com.lti.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	
	@Autowired
	private ICustomerDao iCustomerDao;
	
	
	public void setiCustomerDao(ICustomerDao iCustomerDao) {
		this.iCustomerDao = iCustomerDao;
	}
	
	
	@Override
	public void addCustomer(Customer customer) {
		this.iCustomerDao.addCustomer(customer);
	}

}
