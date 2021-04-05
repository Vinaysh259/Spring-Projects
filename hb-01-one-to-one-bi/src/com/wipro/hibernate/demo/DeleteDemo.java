package com.wipro.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Instructor;
import com.wipro.hibernate.demo.entity.InstructorDetails;


public class DeleteDemo {

	public static void main(String[] args) {
		
		//Create session facotry
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(InstructorDetails.class)
				.addAnnotatedClass(Instructor.class)
				.buildSessionFactory();
		 
		//create a session
		Session session = sessionFactory.getCurrentSession();
		
		
		try {
			
			//use session object to save the java objects
			int id = 1;
			
			//create a transaction
			session.beginTransaction();
			
			//Get the instructor by id
			Instructor instructor  = session.get(Instructor.class, id);
			
			
			//save the instructor
			System.out.println("\n\n###################################\n\n");
			
			if(instructor != null) {
				System.out.println("Found instructor : " + instructor);
				System.out.println("\nDeleting instructor............");
				session.delete(instructor);
				
			}
			
			System.out.println("\n\n###################################\n\n");

			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Deleted successfull!!!!!!!!!!");
		} 
		
		
			finally {
			// TODO: handle finally clause
				sessionFactory.close();
		}

	}

}
