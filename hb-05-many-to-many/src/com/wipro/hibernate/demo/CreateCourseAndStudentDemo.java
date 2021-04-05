package com.wipro.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Course;
import com.wipro.hibernate.demo.entity.Instructor;
import com.wipro.hibernate.demo.entity.InstructorDetail;
import com.wipro.hibernate.demo.entity.Review;
import com.wipro.hibernate.demo.entity.Student;


public class CreateCourseAndStudentDemo {

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
			//Get the instructor from the database
			
			Course course1 = new Course("Web Development 101");

			System.out.println("Saving the course........");
			
			session.save(course1);
			
			//Create the students
			Student student1 = new Student("John","doe","johndoe@gmail.com");
			Student student2 = new Student("Mary","Bird","Marybiird@gmail.com");

			//Add the students to the course
			course1.addStudent(student1);
			course1.addStudent(student2);
			
			System.out.println("Saving the students........");
			//save the students
			session.save(student1);
			session.save(student2);
			
			System.out.println("Saved the students : " + course1.getStudents());
			
			
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
