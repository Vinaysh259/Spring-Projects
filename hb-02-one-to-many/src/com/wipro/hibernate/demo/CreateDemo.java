package com.wipro.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Course;
import com.wipro.hibernate.demo.entity.Instructor;
import com.wipro.hibernate.demo.entity.InstructorDetail;


public class CreateDemo {

	public static void main(String[] args) {
		
		//Create session facotry
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class)
				.buildSessionFactory();
		 
		//create a session
		Session session = sessionFactory.getCurrentSession();
		
		
		try {
			
			//use session object to save the java objects
			
			//Create the objects
			Instructor instructor = new Instructor("Vinay","Hegde","vinay@yopmail.com");
			
			InstructorDetail instructorDetail = new InstructorDetail("http://cr7football.youtube.com","football");
			
			//Associate the objects
			instructor.setInstructorDetail(instructorDetail);
			
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
				session.close();
				sessionFactory.close();
		}

	}

}
