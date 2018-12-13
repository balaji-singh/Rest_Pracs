/**
 * 
 */
package com.masterjavaonline.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * @author balasingh
 *
 */
public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static {
		try {
			Configuration configObj = new Configuration().configure("hibernate.cfg.xml");
			ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
					.applySettings(configObj.getProperties()).build();
			sessionFactory = configObj.buildSessionFactory(serviceRegistryObj);

		} catch (Exception ex) {
			System.err.println("SessionFactory creation Failed" + ex);
			// throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}
