package com.vinay.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemo {

	public static void main(String[] args) {
		
		//Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle-applicationContext.xml");
		
		//load the bean
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//Call the method on theCoach
		System.out.println(theCoach.getDailyWorkout());
		
		//Close the context
		context.close();
	}

}
