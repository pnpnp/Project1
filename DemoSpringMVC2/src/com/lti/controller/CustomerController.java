package com.lti.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.model.Customer;
import com.lti.service.ICustomerService;

@Controller
public class CustomerController {

	@Autowired
	private ICustomerService customerService;
	
	
	public void setCustomerService(ICustomerService cs) {
		this.customerService = cs;
	}
	
	
	@RequestMapping(value="/customer")
	public String gotocustomerregpage(Model model) {
	model.addAttribute("customer",new Customer());
		return "CustomerRegistration";
	}
	
	
	@RequestMapping(value = "/customer/add", 
			method = RequestMethod.POST)
	public String addFarmer(
			@ModelAttribute("customer") 
			@Valid Customer customer, 
			BindingResult result, 
			Model model) {
		if (!result.hasErrors()) {
		
				// new farmer, add it
				this.customerService.addCustomer(customer);
			} 
			
			return "redirect:/customer";
		}
	
	
	
	
	
}
