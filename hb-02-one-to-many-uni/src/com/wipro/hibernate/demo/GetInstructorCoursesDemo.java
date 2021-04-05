package com.wipro.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Course;
import com.wipro.hibernate.demo.entity.Instructor;
import com.wipro.hibernate.demo.entity.InstructorDetail;


public class GetInstructorCoursesDemo {

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
			int id = 1;
			//create a transaction
			session.beginTransaction();
			
			System.out.println("\n\n###################################\n\n");
			//Get the instructor from the database
			Instructor instructor = session.get(Instructor.class, id);
			System.out.println("\n\n");
			System.out.println("Instructor : " + instructor);
			System.out.println("\n\n");
			System.out.println("\n\nCourses : " + instructor.getCourses());
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("\n\n###################################\n\n");
			System.out.println("successfull!!!!!!!!!!");
		} 
		
		
			finally {
				session.close();
				sessionFactory.close();
		}

	}

}
