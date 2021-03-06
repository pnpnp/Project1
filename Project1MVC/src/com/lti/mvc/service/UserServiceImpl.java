package com.lti.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mvc.dao.IUserDao;
import com.lti.mvc.model.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
	private IUserDao userDao;
	
	@Autowired
	public void setUser(IUserDao user) {
		this.userDao = user;
	}

	@Override
	
	public void createUser(User user) {
		this.userDao.createUser(user);

	}

	@Override

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.updateUser(user);
	}

	@Override
	
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return this.userDao.listUser();
	}

	@Override
	
	public void addUser(User user) {
		this.userDao.addUser(user);
		
	}

}
