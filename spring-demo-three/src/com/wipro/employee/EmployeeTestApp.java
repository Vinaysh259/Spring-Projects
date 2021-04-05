package com.wipro.employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeTestApp {

	public static void main(String[] args) {
		
		//COnfigure the bean factory
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		//Get the bean
		Employee theEmployee = context.getBean("employee",Employee.class);
		
		//Call the method  on the bean
		theEmployee.showInfo();
		
		//Close the context
		context.close();

	}

}
