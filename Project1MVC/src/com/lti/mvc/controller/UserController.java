package com.lti.mvc.controller;



import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.mvc.exception.CustomException;

import com.lti.mvc.model.User;
import com.lti.mvc.service.IUserService;

@Controller
public class UserController {

	private IUserService userService;

	@Autowired
	//@Qualifier(value = "userService")
	public void setUser(IUserService iuser) {
		this.userService = iuser;
	}
	
	
	@ExceptionHandler(CustomException.class)
	public ModelAndView handlePersonNotFoundException(CustomException ex) {
		Map<String, CustomException> model = new HashMap<String, CustomException>();
		model.put("exception", ex);
		return new ModelAndView("error", model);

	}

	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception ex) {
		Map<String, Exception> model = new HashMap<String, Exception>();
		model.put("exception", ex);
		return new ModelAndView("error", model);

	}
	
	@RequestMapping("/user")
	public String listUser(Model model) {
		model.addAttribute("user", new User());// model
		model.addAttribute("listUser", this.userService.listUser());
		return "user";// view name
	}

	
	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	@ExceptionHandler({ CustomException.class })
	public String addUser(@ModelAttribute("user") @Valid User u, BindingResult result, Model model) {
		
		System.out.println("inside User model");
		if (!result.hasErrors()) {
			if (u.getEmailId() == null) {
				// new person, add it
				 this.userService.addUser(u);
			} else {
				// existing person, call update
				this.userService.updateUser(u);
			}
			return "redirect:/user";
		}
		model.addAttribute("listUser", this.userService.listUser());
		return "user";

	}
	
	
	@RequestMapping("/showErrorPage/error")
	@ExceptionHandler(Exception.class)
	public ModelAndView exception(Exception e) {

		ModelAndView mav = new ModelAndView("error");// view name
		mav.addObject("exName", e.getClass().getSimpleName());// model for ex name
		mav.addObject("exMessage", e.getMessage());// model for ex msg
		return mav;
	}
	
}
