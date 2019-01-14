package com.lti.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lti.mvc.model.Customer;


public class CustomerDaoImpl implements ICustomerDao {

	
	private static final Logger logger = LoggerFactory.getLogger(CustomerDaoImpl.class);

	private SessionFactory sessionFactory;

	@Autowired // if annotated as repository then dont need to put entries in .xml
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	
	
	@Override
	public void addCustomer(Customer customer) {
		Session session = this.sessionFactory.openSession();
		session.save(customer); // session.save will also work
		logger.info("Customer saved successfully, Customer Details=" + customer);
		session.close();

	}

	@Override
	public void updateCustomer(Customer customer) {
		Session session = this.sessionFactory.openSession();
		session.update(customer);
		logger.info("Customer updated successfully, " + "Customer Details=" + customer);
		session.save(customer);
	}

	@Override
	@SuppressWarnings("unchecked") // to supress warnings
	public List<Customer> listCustomer() {
		Session session = this.sessionFactory.openSession();
		List<Customer> customerList = session.createQuery("from Customer").list(); // same as query.list
		for (Customer customer : customerList) {
			logger.info("Customer List::" + customer);
		}
		return customerList;
		
	}

	@Override
	public Customer getCustomerById(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeCustomer(String emailId) {
		Session session = this.sessionFactory.openSession();
		Customer customer = (Customer) session.load(Customer.class, new String(emailId));
		if (null != customer) {
			session.delete(customer);
		} else {
			logger.error("Customer NOT deleted, with customer emailId=" + emailId);
		}
		logger.info("Customer deleted successfully, customer details=" + customer);
	}

	}


