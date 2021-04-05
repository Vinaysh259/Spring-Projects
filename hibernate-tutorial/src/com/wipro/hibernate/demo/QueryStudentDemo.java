package com.wipro.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		
		org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(QueryStudentDemo.class);
		
		//Create session facotry
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		 
		//create a session
		Session session = sessionFactory.getCurrentSession();
		
		
		try {
			
			//create a transaction
			session.beginTransaction();
			
			//Query the students
			List<Student> students = session.createQuery("from Student").getResultList();
			
			//List the student
			displayStudent(students);
			
			
			//query students : lastName = h
			students = session.createQuery("from Student s where s.lastName='h'").getResultList();
			
			displayStudent(students);
			
			
			//query students : email with gmail
			students = session.createQuery("from Student s where s.email like '%@gmail.com'").getResultList();
			
			logger.info("Student with gmail account....");
			displayStudent(students);
			//commit the transaction
			session.getTransaction().commit();
			logger.info("Done!!!!!!!");
		} 
		
		
			finally {
			// TODO: handle finally clause
				sessionFactory.close();
		}

	}

	private static void displayStudent(List<Student> students) {
		for(Student tempStudent : students) {
			System.out.println(tempStudent);
		}
	}

}
