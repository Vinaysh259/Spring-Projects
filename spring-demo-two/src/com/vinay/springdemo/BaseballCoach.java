package com.vinay.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend thirty minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public void beanStartup() {
		System.out.println("TrackCoach : Inside the startup method");
	}
	
	public void beanCleanup() {
		System.out.println("TrackCoach : Inside the Cleanup method");
	}
}
