package com.odessey.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OdesseyUtil {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		return sessionFactory;
	}

}
