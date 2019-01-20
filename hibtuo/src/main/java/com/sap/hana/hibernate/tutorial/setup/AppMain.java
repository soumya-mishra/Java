package com.sap.hana.hibernate.tutorial.setup;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AppMain {

	static CaseAttr demoCase;
	static Session sessionObj;
	static SessionFactory sessionFactoryObj;

	private static SessionFactory buildSessionFactory() {
		Configuration configObj = new Configuration();
		configObj.configure("hibernate.cfg.xml");
		// Since Hibernate Version 4.x, ServiceRegistry Is Being Used
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder()
				.applySettings(configObj.getProperties()).build();
		// Creating Hibernate SessionFactory Instance
		sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
		return sessionFactoryObj;

	}
	public static void main(String[] args) {
		sessionObj = buildSessionFactory().openSession();
		 sessionObj.beginTransaction();
		 @SuppressWarnings("unchecked")
		List<CaseAttr> cases = sessionObj.createQuery("FROM com.sap.hana.hibernate.tutorial.setup.CaseAttr").list();
		 Iterator<CaseAttr> iter = cases.iterator();
		 while(iter.hasNext()) {
			 CaseAttr casein = (CaseAttr)iter.next();
			 System.out.println(casein.getCaseGuid());
			 System.out.println(casein.getNotePoid());
			 System.out.println(casein.getRecordPoid());
			 System.out.println(casein.getWfname());
			 
		 }

		
	}
	
	

	
}