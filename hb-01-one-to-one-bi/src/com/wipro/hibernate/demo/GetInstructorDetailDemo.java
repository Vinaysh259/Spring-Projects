package com.wipro.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Instructor;
import com.wipro.hibernate.demo.entity.InstructorDetails;


public class GetInstructorDetailDemo {

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
			int id = 3;
			
			//create a transaction
			session.beginTransaction();
			
			//save the instructor
			System.out.println("\n\n#################Bidirectional##################\n\n");
			//Instructor instructor  = session.get(Instructor.class, id);
			//Get the instructor detail
			InstructorDetails instructorDetails = session.get(InstructorDetails.class, id);
			
			System.out.println("\nInstructor detail : " + instructorDetails);
			//Get the instructor
			
			System.out.println("\nInstructor : " + instructorDetails.getInstructor());
			
			System.out.println("\n\n###################################\n\n");

			//commit the transaction
			session.getTransaction().commit();
			System.out.println("successfull!!!!!!!!!!");
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
			finally {
				session.close();
				sessionFactory.close();
		}

	}

}
