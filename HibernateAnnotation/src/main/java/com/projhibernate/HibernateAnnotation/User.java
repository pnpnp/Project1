package com.projhibernate.HibernateAnnotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="User")
public class User {
	public User() {
		super();
	}
	public User(Name name, int phoneNumber, String gender, String country, String address, int aadhar,
			int dateofBirth) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		Gender = gender;
		Country = country;
		Address = address;
		Aadhar = aadhar;
		this.dateofBirth = dateofBirth;
	}

	@Column(name="name")
	private Name name;
	@Column(name="phoneNumber")
	private int phoneNumber;
	@Column(name="Gender")
   private 	String Gender;
	@Column(name="Country")
	private String Country;
	@Column(name="Address")
	private String Address;
  private int Aadhar;
  
  @Column(name="dateofBirth")
  private int dateofBirth;
  
  
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
public Integer getDOB() {
	return dateofBirth;
}
public void setDOB(Integer dOB) {
	dateofBirth = dOB;
}
 
@Override
public String toString() {
	return "User [name=" + name + ", phoneNumber=" + phoneNumber + ", Gender=" + Gender + ", Country=" + Country
			+ ", Address=" + Address + ", Aadhar=" + Aadhar + ", DOB=" + dateofBirth + "]";
	

}}
