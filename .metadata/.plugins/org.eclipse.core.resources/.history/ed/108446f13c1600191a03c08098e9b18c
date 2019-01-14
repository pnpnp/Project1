package com.projhibernate.HibernateAnnotation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Table;

@Entity
@Table(name="credentials")
public class Credentials
{

public Credentials() {
		super();
	}
public Credentials(String emailID, String password) {
		super();
		this.emailID = emailID;
		this.password = password;
	}


@GeneratedValue(strategy=GenerationType.SEQUENCE)
private String emailID;
private String password;

public String getEmailID() {
	return emailID;
}
public String getPassword() {
	return password;
}
public void setEmailID(String emailID) {
	this.emailID = emailID;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Credentials [emailID=" + emailID + ", password=" + password + "]";
}
}
