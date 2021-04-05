package com.wipro.answersmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuestionConfig {
	
	@Bean
	public Question question() {
		Map<String,String> answers = new LinkedHashMap<String,String>();
		answers.put("Java is a programming language","Vinay");
		answers.put("Java is an Island", "Ram");
		return new Question(1,"What is JAVA?",answers);
	}
}
