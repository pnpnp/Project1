package com.lti.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lti.mvc.dao.IPersonDao;
import com.lti.mvc.model.Person;

//@Service
public class PersonServiceImpl implements IPersonService {
	private IPersonDao personDao;

	// setter method for personDao
	@Autowired
	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}

	@Override
	@Transactional // implicitly commit if added without exception or will rollback if there is
					// exception
	public void addPerson(Person p) {
		this.personDao.addPerson(p);
	}

	@Override
	@Transactional
	public void updatePerson(Person p) {
		this.personDao.updatePerson(p);
	}

	@Override
	@Transactional
	public List<Person> listPersons() {
		return this.personDao.listPersons();
	}

	@Override
	@Transactional
	public Person getPersonById(int id) {
		return this.personDao.getPersonById(id);
	}

	@Override
	@Transactional
	public void removePerson(int id) {
		this.personDao.removePerson(id);
	}
}
