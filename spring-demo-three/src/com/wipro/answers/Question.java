package com.wipro.answers;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int id;
	private String name;
	private List<Answer> answer;
	
	public Question() {
		System.out.println("Default");
	}
	
	public Question(int id, String name, List<Answer> answer) {
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	public void showQuestion(){
		System.out.println("Question No.: "+id);
		System.out.println("Question :" + name);
		System.out.println("\nAnswers : ");
		Iterator<Answer> itr = answer.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
