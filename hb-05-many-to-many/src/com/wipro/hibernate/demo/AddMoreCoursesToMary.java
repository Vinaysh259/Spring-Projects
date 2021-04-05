package com.wipro.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Course;
import com.wipro.hibernate.demo.entity.Instructor;
import com.wipro.hibernate.demo.entity.InstructorDetail;
import com.wipro.hibernate.demo.entity.Review;
import com.wipro.hibernate.demo.entity.Student;


public class AddMoreCoursesToMary {

	public static void main(String[] args) {
		
		//Create session facotry
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(Review.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		 
		//create a session
		Session session = sessionFactory.getCurrentSession();
		
		
		try {
			
			//use session object to save the java objects

			//create a transaction
			session.beginTransaction();
			
			System.out.println("\n\n###################################\n\n");

			int id = 2;
			//Get the student from the database
			Student student1 = session.get(Student.class, id);
			
			System.out.println("\nStudent info : " + student1);
			
			System.out.println("\nCourses : " + student1.getCourses());
			
			//Create more courses
			Course course1 = new Course("AWS cloud practitioner");
			Course course2 = new Course("AZ-9002");
			
			//Add the student to those courses
			System.out.println("\n\nAdding the student to the courses ............");
			course1.addStudent(student1);
			course2.addStudent(student1);
			
			session.save(course1);
			session.save(course2);
						
			//commit the transaction
			session.getTransaction().commit();
			System.out.println("\n\n###################################\n\n");
			System.out.println("Successfull!!!!!!!!!!");
		} 
		
		
			finally {
				session.close();
				sessionFactory.close();
		}

	}

}
