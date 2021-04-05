package com.wipro.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Instructor;
import com.wipro.hibernate.demo.entity.InstructorDetails;


public class CreateDemo {

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
			
			//Create the objects
			Instructor instructor = new Instructor("Viraj","Jain","viraj@yopmail.com");
			
			InstructorDetails instructorDetails = new InstructorDetails("http://chesswizard.youtube.com","chess and carrom");
			
			//Associate the objects
			instructor.setInstructorDetails(instructorDetails);
			
			//create a transaction
			session.beginTransaction();
			
			//save the instructor
			System.out.println("\n\n###################################\n\n");
			System.out.println("\nSaving the instructor............" + instructor);
			
			session.save(instructor);
			
			System.out.println("\n\n###################################\n\n");

			//commit the transaction
			session.getTransaction().commit();
			System.out.println("Saved successfully!!!!!!!!!!");
		} 
		
		
			finally {
			// TODO: handle finally clause
				sessionFactory.close();
		}

	}

}
