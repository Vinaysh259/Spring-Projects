package com.wipro.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // default value is singleton
public class TennisCoach implements Coach {
	
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneservice) {
//		this.fortuneService = fortuneservice;
//	}
	
	//Default constructor
	public TennisCoach() {
		System.out.println("Inside the default contructor");
	}
	
	//Setter method for FortuneService
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Inside the setter method");
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	
	//define init method
	@PostConstruct
	public void starupMethod() {
		System.out.println("Startup method");
	}
	
	//define destroy method
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Destroy Method");
	}

}
