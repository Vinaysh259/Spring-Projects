package com.vinay.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
		
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside the setter method for email address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside the setter method for team");
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Cricket coach :No-arg constructor");
	}
	
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("Inside the setter method FortuneService");
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do 1 hour of fielding task";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
