package com.wipro.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		
		//Create session factory
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		//Create session object
		Session session = sessionFactory.getCurrentSession();
		
		
		try {
			//Create 3 students
			System.out.println("Creating 3 students.........");
			Student student1 = new Student("viraj","j","viraj@gmail.com");
			Student student2 = new Student("virag","m","virag@outlook.com");
			Student student3 = new Student("vinday", "s", "vinda@gmail.com");
			
			//Create a transaction
			session.beginTransaction();
			
			//Save the student objects
			System.out.println("Saving students details............");
			session.save(student1);
			session.save(student2);
			session.save(student3);
			
			
			//Commit the transaction
			session.getTransaction().commit();
			System.out.println("Saved!!!!!!!!!");
			
		}
		
		finally {
			sessionFactory.close();
		}

	}

}
