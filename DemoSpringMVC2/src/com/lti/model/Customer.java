package com.lti.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="customer_sequence")
	@SequenceGenerator(name="customer_sequence",sequenceName="customer_sequence")
	@Column
	private int customerId;
	
	@Column
	private String customerName;
	
	
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Column
	private String emailId;
	
	@Column
	private String password;
	
	@Column
	private String gender;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public Customer(int customerId, String customerName, String emailId, String password, String gender) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.emailId = emailId;
		this.password = password;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", emailId=" + emailId
				+ ", password=" + password + ", gender=" + gender + "]";
	}

	public Customer() {
		super();
	}
	
	
	
}
