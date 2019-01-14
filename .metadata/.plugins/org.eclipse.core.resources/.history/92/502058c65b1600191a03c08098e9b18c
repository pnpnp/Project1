package com.lti.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lti.mvc.model.Department;

public class DepartmentDAOImpl implements IDepartmentDAO {

	private static final Logger logger = LoggerFactory.getLogger(DepartmentDAOImpl.class);
	private SessionFactory sessionFactory;

	@Autowired // if annotated as repository then dont need to put entries in .xml
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void createDept(Department d) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.save(d);
		logger.info("Emp Details saced successfully: " + d);
	}

	@Override
	public void deleteDept(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		DepartmentDAOImpl emp = (DepartmentDAOImpl) session.load(DepartmentDAOImpl.class, new Integer(id));
		if (null != emp) {
			session.delete(emp);
		} else {
			logger.error("Employee NOT deleted, with employee Id=" + id);
		}
		logger.info("Employee deleted successfully, employee details=" + emp);
	}

	@Override
	public List<Department> listDept() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department listById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Department dept = (Department) session.load(Department.class, new Integer(id));
		logger.info("Department loaded successfully, Department details=" + dept);
		return dept;
	}

}
