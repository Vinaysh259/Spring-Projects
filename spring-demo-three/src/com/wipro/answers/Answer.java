package com.wipro.answers;

public class Answer {
	
	private int id;
	private String name;
	private String by;
	
	public Answer() {
		System.out.println("Default");
	}
	
	public Answer(int id, String name, String by) {
		this.id = id;
		this.name = name;
		this.by = by;
	}
	
	public String toString() {
		return " Thread id : " + id + "\n Answer : " + name + "\n Posted by : " + by;
	}
}
