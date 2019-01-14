package com.lti.mvc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "dept_seq")
	@SequenceGenerator(name = "dept_seq", sequenceName = "deptSeq")
	private int department_id;
	private String departmentName;

	@OneToMany(cascade = CascadeType.ALL)
	private List<EmployeeDetails> employee;

	public Department() {
		super();
	}

	public Department(int department_id, String departmentName, List<EmployeeDetails> employee) {
		super();
		this.department_id = department_id;
		this.departmentName = departmentName;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", departmentName=" + departmentName + ", employee="
				+ employee + "]";
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public List<EmployeeDetails> getEmployee() {
		return employee;
	}

	public void setEmployee(List<EmployeeDetails> employee) {
		this.employee = employee;
	}
}
