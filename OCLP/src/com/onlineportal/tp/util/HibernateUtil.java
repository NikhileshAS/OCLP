package com.onlineportal.tp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
	private static SessionFactory sf=null;

	public static SessionFactory getSessionFactory(){
		try{
			sf = new Configuration().configure("hib.cfg.xml").buildSessionFactory();
			
		}
		catch(Exception e){
			System.out.println(e);
			throw new ExceptionInInitializerError(e);
		}
		return sf;
	}	

}
