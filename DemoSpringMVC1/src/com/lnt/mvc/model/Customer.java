package com.lnt.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	private int customerId; //change this to auto generated
	
	private String name;
	
	private String password;
	private String gender;
	private String country;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Customer(int customerId, String name, String password, String gender, String country) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", password=" + password + ", gender=" + gender
				+ ", country=" + country + "]";
	}
	
	
}
