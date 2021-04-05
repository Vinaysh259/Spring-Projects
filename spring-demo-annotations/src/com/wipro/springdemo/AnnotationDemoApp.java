package com.wipro.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from the container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		FootballCoach footBallCoach = context.getBean("footballCoach",FootballCoach.class);
		
		//call some method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		footBallCoach.displayProperties();
		
		//close the context
		context.close();
	}

}
