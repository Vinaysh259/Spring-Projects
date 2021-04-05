package com.wipro.question;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuestionConfig {
	
	@Bean
	public Question question() {
		List<String> answers = new ArrayList<String>();
		answers.add("Java is a programming language");
		answers.add("Java is a platform");
		answers.add("Java is an Island in Taiwan");
		return new Question(1,"What is JAVA?",answers);
	}
}
