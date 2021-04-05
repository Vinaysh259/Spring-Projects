package com.wipro.answers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuestionConfig {
	
	@Bean
	public Question question() {
		List<Answer> answers = new ArrayList<Answer>();
		answers.add(new Answer(1,"Java is a programming language","Vinay"));
		answers.add(new Answer(2,"Java is a platform","Ram"));
		return new Question(1,"What is JAVA?",answers);
	}
}
