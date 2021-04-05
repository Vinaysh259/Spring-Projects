package com.wipro.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim for 1000 meters as a warmup";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
