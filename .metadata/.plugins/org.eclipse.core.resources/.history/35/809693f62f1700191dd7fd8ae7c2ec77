package com.lti.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mvc.dao.IEmployeeDetailsDAO;
import com.lti.mvc.model.EmployeeDetails;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	private IEmployeeDetailsDAO empdao;

	@Autowired
	public void setEmpdao(IEmployeeDetailsDAO empdao) {
		this.empdao = empdao;
	}

	@Override
	@Transactional
	public void createEmpDetails(EmployeeDetails ed) {
		// TODO Auto-generated method stub
		this.empdao.createEmpDetails(ed);

	}

	@Override
	@Transactional
	public void deleteEmpDetails(int employee_id) {
		// TODO Auto-generated method stub
		this.empdao.deleteEmpDetails(employee_id);
	}

	@Override
	@Transactional
	public void updateEmpDetails(EmployeeDetails ed) {
		// TODO Auto-generated method stub
		this.empdao.updateEmpDetails(ed);
	}

	@Override
	@Transactional
	public EmployeeDetails listEmpById(int employee_id) {
		// TODO Auto-generated method stub
		return this.empdao.listEmpById(employee_id);
	}

	@Override
	@Transactional
	public List<EmployeeDetails> listEmployee() {
		return this.empdao.listEmployee();
	}

}
