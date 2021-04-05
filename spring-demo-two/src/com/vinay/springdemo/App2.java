package com.vinay.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		
		//Load the spring configuration container
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from the spring container
		
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//Call the method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println(theCoach.getEmailAddress());
		
		System.out.println(theCoach.getTeam());
		//Close the context
		context.close();
	}

}
