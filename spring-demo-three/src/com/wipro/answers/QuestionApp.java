package com.wipro.answers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class QuestionApp {

	public static void main(String[] args) {
		
		//Configure the Bean factory
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(QuestionConfig.class);
		
		//Get the bean
		Question firstQuestion = context.getBean("question",Question.class);
		
		//Call the method on the bean
		firstQuestion.showQuestion();
		
		//Close the context
		context.close();
	}

}
