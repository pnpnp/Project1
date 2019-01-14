package com.lti.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.mvc.model.User;

@Repository
public class UserDaoImpl implements IUserDao {

	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void createUser(User user) {
		Session session = this.sessionFactory.openSession();
		session.save(user);
		logger.info("User Details saced successfully: " + user);
		session.close();

	}

	@Override
	public void updateUser(User user) {
		Session session = this.sessionFactory.openSession();
		session.update(user);
		logger.info("Emp details updated: " + user);
		session.close();

	}

	@Override
	public List<User> listUser() {
		Session session = this.sessionFactory.openSession();
		List<User> userList = session.createQuery("from User").list();
		for (User  user : userList) {
			logger.info("User List::" + user);
		}
		session.close();
		return userList;
	}

	@Override
	public void addUser(User user) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(user); // session.save will also work
		logger.info("Person saved successfully, Person Details=" + user);
	}

}