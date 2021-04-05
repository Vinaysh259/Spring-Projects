package com.vinay.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		//Load the configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope-applicationContext.xml");
		
		//Get the beans
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//Testing the singleton
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println(" \n Pointing to the same location : " + result);
		
		System.out.println("\n Memory location of theCoach :" + theCoach);
		
		System.out.println("\n Memory location of alphaCoach : " + alphaCoach);
		
		
		//Close the application context
		context.close();
	}

}
