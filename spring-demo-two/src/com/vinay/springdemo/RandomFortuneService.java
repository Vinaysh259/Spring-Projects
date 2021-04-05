package com.vinay.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	public Random random = new Random();
	@Override
	public String getFortune() {
		
		String[] fortunes = {"Lucky day!!!!","Oooh Bad day!!!","Neither good nor bad!!!!!"};
		
		int randomNumber = random.nextInt(3);
//		
		return fortunes[randomNumber];
	}

}
