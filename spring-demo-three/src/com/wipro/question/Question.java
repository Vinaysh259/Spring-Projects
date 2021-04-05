package com.wipro.question;

import java.util.Iterator;
import java.util.List;

public class Question {
	
	private int id;
	private String name;
	private List<String> answers;
	
	public Question() {
		System.out.println("Default");
	}
	
	public Question(int id, String name, List<String> answers) {
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void showQuestion(){
		System.out.println("Question No.: "+id);
		System.out.println("Question :" + name);
		System.out.println("Answers : ");
		Iterator<String> itr = answers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
