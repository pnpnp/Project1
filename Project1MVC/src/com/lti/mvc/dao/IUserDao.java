package com.lti.mvc.dao;

import java.util.List;


import com.lti.mvc.model.User;

public interface IUserDao {

	
	public void addUser(User user);
	
	public void createUser(User user);
	
	public void updateUser(User user);
	
	List<User> listUser();
}
