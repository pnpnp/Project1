package com.lti.mvc.model;


import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="Customer")
public class User{
	public User() {
		super();
	}

	
	
	public User(int phoneNumber, String gender, String country, String address, int aadhar, Date dateOfBirth,
			String emailId, String password) {
		super();
		this.phoneNumber = phoneNumber;
		Gender = gender;
		Country = country;
		Address = address;
		Aadhar = aadhar;
		this.dateOfBirth = dateOfBirth;
		this.emailId = emailId;
		this.password = password;
	}



	private int phoneNumber;
	
	
   private 	String Gender;
	
	
	private String Country;
	
	
	private String Address;
  

	private int Aadhar;
  

	private Date dateOfBirth;
	
	@Id
	private String emailId;
	
	@Column
	private String password;
	


	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public int getAadhar() {
		return Aadhar;
	}

	public void setAadhar(int aadhar) {
		Aadhar = aadhar;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	@Override
	public String toString() {
		return "User [phoneNumber=" + phoneNumber + ", Gender=" + Gender + ", Country=" + Country + ", Address="
				+ Address + ", Aadhar=" + Aadhar + ", dateOfBirth=" + dateOfBirth + ", emailId=" + emailId
				+ ", password=" + password + "]";
	}

	



	
	
	
}