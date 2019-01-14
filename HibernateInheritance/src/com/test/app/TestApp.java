package com.test.app;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.test.model.Module;
import com.test.model.Project;
import com.test.model.Task;

import util.Hibernate_Util;

public class TestApp {

	public static void main(String[] args) {

		Project p1 = new Project();
		p1.setId(1);// optional as we are using generate annotation for id

		p1.setTitle("ABC");

		Module m1 = new Module();
		m1.setName("Testing");
		m1.setId(p1.getId());
		// m1.setTitle(p1.getTitle());

		Task t1 = new Task();
		t1.setId(p1.getId());
		t1.setName(m1.getName());
		t1.setTaskName("Do");

		SessionFactory factory = Hibernate_Util.getSessionfactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(p1);
		session.save(m1);
		session.save(t1);
		tx.commit();

		Query query = session.createQuery("from Project"); // give class name not table name;
		List<Project> projectlist = query.list();
		for (Project prj : projectlist) {
			System.out.println(prj);
		}

		session.close();

	}

}
