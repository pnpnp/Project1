package com.lnt.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lnt.mvc.model.Person;

//@Repository
public class PersonDaoImpl implements IPersonDao {
	private static final Logger logger = 			
			LoggerFactory.getLogger(PersonDaoImpl.class);

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void addPerson(Person p) {
		Session session = this.sessionFactory.openSession();
		session.persist(p);
		logger.info("Person saved successfully, Person Details="
		+ p);
		session.close();
	}

	@Override
	public void updatePerson(Person p) {
		Session session = 
				this.sessionFactory
				.getCurrentSession();
		session.update(p);
		logger.info("Person updated successfully, "
				+ "Person Details=" + p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Person> listPersons() {
		Session session = this.sessionFactory.openSession();
		List<Person> personsList = session.createQuery("from Person").list();
		for (Person p : personsList) {
			logger.info("Person List::" + p);
		}
		session.close();
		return personsList;
	}

	@Override
	public Person getPersonById(int id) {
		Session session = this.sessionFactory.openSession();
		Person p = (Person) session.load(Person.class, new Integer(id));
		logger.info("Person loaded successfully, Person details=" + p);
		session.close();
		return p;
	}

	@Override
	public void removePerson(int id) {
		Session session = this.sessionFactory.openSession();
		Person p = 
		(Person) session.load(Person.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}else {
			logger.error
			("Person NOT deleted, with person Id=" +id);
		}
		logger.info("Person deleted successfully, person details=" + p);
		session.close();
	}

}
