package com.lti.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.mvc.model.EmployeeDetails;
import com.lti.mvc.service.IEmployeeService;

@Controller
public class EmployeeDetailsController {

	private IEmployeeService empservice;

	@Autowired
	public void setEmpservice(IEmployeeService empservice) {
		this.empservice = empservice;
	}

	// @RequestMapping(value = "/employee", method = RequestMethod.GET)
	// public String listEmployeeDetails(Model model) {
	// model.addAttribute("employee", new EmployeeDetails());// model
	// // model.addAttribute("listEmployeeDetails", this.empservice.listPersons());
	// return "employee";// view name
	// }

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String EmployeeDetails(Model model) {

		model.addAttribute("employee", new EmployeeDetails());// model
		model.addAttribute("listemployee", this.empservice.listEmployee());
		return "employee";// view name
	}

}
