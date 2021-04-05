package com.wipro.employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.wipro.employee")
public class EmployeeConfig {
	
	@Bean
	public Address address() {
		return new Address("Sirsi","India");
	}
	
	@Bean
	public Employee employee() {
		return new Employee("Vinay",address());
	}

}
