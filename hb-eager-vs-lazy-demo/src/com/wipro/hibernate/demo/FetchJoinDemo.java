package com.wipro.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.wipro.hibernate.demo.entity.Course;
import com.wipro.hibernate.demo.entity.Instructor;
import com.wipro.hibernate.demo.entity.InstructorDetail;


public class FetchJoinDemo {

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
			//create a transaction
			session.beginTransaction();
			
			System.out.println("\n\n###################################\n\n");
			//Get the instructor from the database
			int theId = 1;
			
			Query<Instructor> query = session.createQuery("select i from Instructor i "
					+ "JOIN FETCH i.courses "
					+ "where i.id=:theInstructorId",
					Instructor.class);
			query.setParameter("theInstructorId", theId);
			
			Instructor instructor = query.getSingleResult();
			
			System.out.println("\n\n");
	
			System.out.println("Wipro Instructor : " + instructor);
			
			System.out.println("\n\n");
			
			
			//commit the transaction
			session.getTransaction().commit();
			
			session.close();
			
			System.out.println("Session is closed now");
			System.out.println("\n\nWipro Courses : " + instructor.getCourses());
			System.out.println("\n\n###################################\n\n");
			System.out.println("Wipro successfull!!!!!!!!!!");
		} 
		
		
			finally {
				session.close();
				sessionFactory.close();
		}

	}

}
