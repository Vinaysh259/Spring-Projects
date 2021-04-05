package com.wipro.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		//Create session facotry
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		 
		//create a session
		Session session = sessionFactory.getCurrentSession();
		
		
		try {
			
			//use session object to save the java objects
			
			//create a student object
			System.out.println("Creating a student object...........");
			Student tempStudent = new Student("vinay","h","v@gmail.com");
			
			//create a transaction
			session.beginTransaction();
			
			//save the student object
			System.out.println("Saving the student.........");
			session.save(tempStudent);
			
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
