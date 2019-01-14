package com.lti.mvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.lti.mvc.model.EmployeeDetails;

//@Repository
public class EmployeeDetailsDAOImpl implements IEmployeeDetailsDAO {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeDetailsDAOImpl.class);
	private SessionFactory sessionFactory;

	@Autowired // if annotated as repository then dont need to put entries in .xml
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public void createEmpDetails(EmployeeDetails ed) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		session.save(ed);
		logger.info("Emp Details saced successfully: " + ed);
		session.close();
	}

	@Override
	public void deleteEmpDetails(int employee_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		EmployeeDetails emp = (EmployeeDetails) session.load(EmployeeDetails.class, new Integer(employee_id));
		if (null != emp) {
			session.delete(emp);
		} else {
			logger.error("Employee NOT deleted, with employee Id=" + employee_id);
		}
		logger.info("Employee deleted successfully, employee details=" + emp);
		session.close();
	}

	@Override
	public void updateEmpDetails(EmployeeDetails ed) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		session.update(ed);
		logger.info("Emp details updated: " + ed);
		session.close();
	}

	@Override
	public EmployeeDetails listEmpById(int employee_id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		EmployeeDetails emp = (EmployeeDetails) session.load(EmployeeDetails.class, new Integer(employee_id));
		logger.info("Employee loaded successfully, Employee details=" + emp);
		session.close();
		return emp;

	}

	@Override
	public List<EmployeeDetails> listEmployee() {

		Session session = this.sessionFactory.openSession();
		List<EmployeeDetails> employeelist = session.createQuery("from EmployeeDetails").list(); // same as query.list
		for (EmployeeDetails e : employeelist) {
			logger.info("Employee List::" + e);
		}
		session.close();
		return employeelist;
	}
}
