package com.wipro.hibernate.demo;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.wipro.hibernate.demo.entity.Instructor;
import com.wipro.hibernate.demo.entity.InstructorDetail;


public class DeleteInstructorDetailDemo {

	public static void main(String[] args) {
		
		//Create session facotry
		SessionFactory sessionFactory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(InstructorDetail.class)
				.addAnnotatedClass(Instructor.class)
				.buildSessionFactory();
		 
		//create a session
		Session session = sessionFactory.getCurrentSession();
		
		
		try {
			
			//use session object to save the java objects
			int id = 4;
			
			//create a transaction
			session.beginTransaction();
			
			//save the instructor
			System.out.println("\n\n#################Bidirectional##################\n\n");
			//Instructor instructor  = session.get(Instructor.class, id);
			//Get the instructor detail
			InstructorDetail instructorDetail = session.get(InstructorDetail.class, id);
			
			System.out.println("\nDeleteing the Instructor detail : " + instructorDetail);
			//Get the instructor
			System.out.println("\nAssociated Instructor : " + instructorDetail.getInstructor());
			
			//Break down the association // cut the bi directional link
			instructorDetail.getInstructor().setInstructorDetail(null);
			
			session.delete(instructorDetail);
			
			System.out.println("\n\n###################################\n\n");

			//commit the transaction
			session.getTransaction().commit();
			System.out.println("successfull!!!!!!!!!!");
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
			finally {
				session.close();
				sessionFactory.close();
		}

	}

}
