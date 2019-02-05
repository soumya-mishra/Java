package com.toadd.serv;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CreateToadd {

	public static void main(String[] args) {
				
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "toadd_tab" );
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      System.out.println("Entity Manager object created");
	      
	      Query query = entitymanager.createNativeQuery("Select mimetype from sapqal.toadd ");
	     
	      System.out.println(query.toString());
	      List<String> list = query.getResultList();
	      
	      for(String e:list) 	{
	          System.out.println("Mime type :"+e);
	       }
	      
	/*      entitymanager.getTransaction( ).begin( );
	      System.out.println("Transaction begin");
	      ToaddData myentry = new ToaddData();
	      myentry.setDoctype("Testsom11");
	      myentry.setMimetype("Testmime11");
	      myentry.setAppltype("Testappltype11");
	      
	      System.out.println("Data created");
	      entitymanager.persist(myentry);
	      System.out.println("Entry Persisted");

	      entitymanager.getTransaction( ).commit( );
	      System.out.println("Transaction commited");
	      entitymanager.close( );
	      emfactory.close( ); */

	}

}
