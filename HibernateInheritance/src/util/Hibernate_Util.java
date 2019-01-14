package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate_Util {

	private static final SessionFactory sessionFactory;
	static {// why static again?
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("SessionFactory creation Failed:" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	/*
	 * From 4.0 later version onwards build session factory is depricated so use
	 * this public static SessionFactory createSessionFactory(){ Configuration
	 * configuration = new Configuration();configuration.configure();
	 * ServiceRegistry serviceRegistry = new
	 * ServiceRegistryBuilder();configuration.getProperties().buildServiceRegistry()
	 * ;sessionFactory=configuration.buildSessionFactory(serviceRegistry); return
	 * sessionFactory;} dont call getter of session factory after using this
	 */

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}
