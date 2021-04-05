package com.wipro.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		
		//Create session facotry
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		 
		//create a session
		Session session = sessionFactory.getCurrentSession();
		
		
		try {
			
			
			//Get a session and start the transaction
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
//			int studentId = 11;
//			//Retrieve the student from the database
//			System.out.println("\n##################\n\nGetting the student with ID : " + studentId);
//			
//			Student mystudent = session.get(Student.class, studentId);
//			
//			System.out.println("Deleting the student : " + mystudent);
//			session.delete(mystudent);
			
			
			//Deleting the student using HQL
			session.createQuery("delete from Student where id=5").executeUpdate();
			//Commit the transaction
			session.getTransaction().commit();
			System.out.println("Done!!!!!!!!!!!!!!!");
			

		} 
		
		
			finally {
			// TODO: handle finally clause
				sessionFactory.close();
		}

	}

}
