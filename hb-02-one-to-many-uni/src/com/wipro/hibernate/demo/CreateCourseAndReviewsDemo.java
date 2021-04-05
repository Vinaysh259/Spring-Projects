package com.wipro.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Course;
import com.wipro.hibernate.demo.entity.Instructor;
import com.wipro.hibernate.demo.entity.InstructorDetail;
import com.wipro.hibernate.demo.entity.Review;


public class CreateCourseAndReviewsDemo {

	public static void main(String[] args) {
		
		//Create session facotry
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.buildSessionFactory();
		 
		//create a session
		Session session = sessionFactory.getCurrentSession();
		
		
		try {
			
			//use session object to save the java objects

			//create a transaction
			session.beginTransaction();
			
			System.out.println("\n\n###################################\n\n");
			//Get the instructor from the database
			
			Course course1 = new Course("Become a pro in FIFA 14");
			
			course1.addReview(new Review("It was very good"));
			course1.addReview(new Review("I became a legend after watching the tutorial"));
			course1.addReview(new Review("This course is bullshit"));
			
			System.out.println("/nSaving the course with reviews");
			session.save(course1);
			
			
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
