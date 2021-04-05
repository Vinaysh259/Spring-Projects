package com.wipro.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//Loading the properties from the properties file
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	@Override
	public String getDailyWorkout() {
		return "Passing the ball exercise for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void displayProperties() {
		System.out.println("Email ID : " + email);
		System.out.println("Team name : " + team);
	}

}
