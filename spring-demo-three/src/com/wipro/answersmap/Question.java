package com.wipro.answersmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int id;
	private String name;
	private Map<String,String> answers;
	
	public Question() {
		System.out.println("Default");
	}
	
	public Question(int id, String name, Map answers) {
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void showInfo() {
		System.out.println("Question No. : " + id);
		System.out.println("Question : " + name);
		
		Set<Entry<String,String>> set = answers.entrySet();
		
		Iterator<Entry<String,String>> itr = set.iterator();
		
		while(itr.hasNext()) {
			Entry<String,String> entry = itr.next();
//			System.out.println(itr.next());
			System.out.println("Answer : "+entry.getKey() + "\tPosted by : " + entry.getValue());
		}
	}

}
