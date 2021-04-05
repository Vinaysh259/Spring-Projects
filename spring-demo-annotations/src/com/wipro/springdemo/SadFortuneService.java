package com.wipro.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Sad day";
	}

}
