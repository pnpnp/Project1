package com.lti.mvc.service;

import java.util.List;

import com.lti.mvc.model.EmployeeDetails;

public interface IEmployeeService {
	public void createEmpDetails(EmployeeDetails ed);

	public void deleteEmpDetails(int employee_id);

	public void updateEmpDetails(EmployeeDetails ed);

	public EmployeeDetails listEmpById(int employee_id);

	List<EmployeeDetails> listEmployee();
}
