package com.wipro.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		//Create session facotry
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		 
		//create a session
		Session session = sessionFactory.getCurrentSession();
		
		
		try {
			
			int studentId = 1;
			
			System.out.println("#####################");
			
						
			//Get a session and start the transaction
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			//Retrieve the student from the database
			System.out.println("\n##################\n\nGetting the student with ID : " + studentId);
			Student mystudent = session.get(Student.class, studentId);
			System.out.println("\n##################\n\n Retrieved the student : " + mystudent);
			
			
			//Update the student
			System.out.println("Updating the student...............");
			
			mystudent.setFirstName("Scooby");
			//Commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!!!!!!!!!!!!!!!!");
			
			
			
			//New code
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			System.out.println("Updating the students email");
			
			session.createQuery("update Student set email='foo@yopmail.com'").executeUpdate();
			
			session.getTransaction().commit();
		} 
		
		
			finally {
			// TODO: handle finally clause
				sessionFactory.close();
		}

	}

}
