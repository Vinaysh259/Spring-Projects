package com.wipro.cars;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		//Configuring the Bean factory
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		//Get the respective bean
		Vehicle myVehicle = context.getBean("vehicle",Vehicle.class);
		
		System.out.println(myVehicle.Type());
		
	}

}
