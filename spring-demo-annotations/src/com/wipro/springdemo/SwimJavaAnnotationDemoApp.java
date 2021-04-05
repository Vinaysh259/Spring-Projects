package com.wipro.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaAnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from the container
		Coach theCoach = context.getBean("swimCoach",Coach.class);
		
				
		//call some method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
				
		//close the context
		context.close();
	}

}
