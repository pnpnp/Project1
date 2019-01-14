package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="User")
public class User {
	public User() {
		super();
	}
	
	@Column(name="name", nullable = false) //it is object so nullable?
	private Name name;
	
	@Column(name="phoneNumber", nullable = false)
	private int phoneNumber;
	
	@Column(name="Gender")
   private 	String Gender;
	
	@Column(name="Country", nullable = false)
	private String Country;
	
	@Column(name="Address", nullable = false)
	private String Address;
  
	@Column(name="Aadhar", nullable = false)
	private int Aadhar;
  
	@Column(name="dateOfBirth", nullable = false)
	private Date dateOfBirth;
	
	@Id
	@Column(name = "ROLE_NAME", nullable = false)
	private String emailId;
	
	@Column(name="password", nullable = false)
	private String password;
	
	
  
public Name getName() {
	return name;
}
public void setName(Name name) {
	this.name = name;
}
public Integer getPhonenumber() {
	return phoneNumber;
}
public void setPhonenumber(Integer phonenumber) {
	phoneNumber = phonenumber;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public Integer getAadhar() {
	return Aadhar;
}
public void setAadhar(Integer aadhar) {
	Aadhar = aadhar;
}

 
}
