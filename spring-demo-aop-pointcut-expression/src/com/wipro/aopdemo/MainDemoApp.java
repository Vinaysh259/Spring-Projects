package com.wipro.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.aopdemo.dao.AccountDAO;
import com.wipro.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		//Read the config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
				
		//Load the bean
		AccountDAO accountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		MembershipDAO membershipDAO = context.getBean("membershipDAO",MembershipDAO.class);
		
		//Call the business logic
		accountDAO.addAccount();
		membershipDAO.addAccount();
		
		//Close the context
		context.close();
		
	}

}
