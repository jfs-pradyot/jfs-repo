package com.odessey.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.odessey.model.Mission;

public class OdesseyUtil {
	
	private static SessionFactory sessionFactory;
	
	@SuppressWarnings("deprecation")
	public static SessionFactory getSessionFactory() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		return sessionFactory;
	}
	
	

}
