package com.wipro.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Course;
import com.wipro.hibernate.demo.entity.Instructor;
import com.wipro.hibernate.demo.entity.InstructorDetail;


public class CreateCoursesDemo {

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
			
			//Create two courses
			Course course1 = new Course("Coding-101");
			Course course2 = new Course("Football dribling-101");
			
			//Add the courses to the instructor
			instructor.add(course1);
			instructor.add(course2);
			
			//Save the courses
			session.save(course1);
			session.save(course2);
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("\n\n###################################\n\n");
			System.out.println("Saved successfully!!!!!!!!!!");
		} 
		
		
			finally {
				session.close();
				sessionFactory.close();
		}

	}

}
