package com.lti.mvc.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employee_id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private double salary;
	private String phoneNumber;
	private String password;
	private int jobId;
	private int department_id;
	private Date hireDate;

	public Integer getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employee_id=" + employee_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailAddress=" + emailAddress + ", salary=" + salary + ", phoneNumber=" + phoneNumber
				+ ", password=" + password + ", jobId=" + jobId + ", department_id=" + department_id + ", hireDate="
				+ hireDate + "]";
	}

	public EmployeeDetails(String firstName, String lastName, String emailAddress, double salary, String phoneNumber,
			String password, int jobId, int department_id, Date hireDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.jobId = jobId;
		this.department_id = department_id;
		this.hireDate = hireDate;
	}

	public EmployeeDetails() {
		super();
	}

}