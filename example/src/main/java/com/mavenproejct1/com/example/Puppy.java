package com.mavenproejct1.com.example;

public class Puppy {
	
	int puppyAge;
	String puppyName;
	
	public Puppy(String name)
	{
		puppyName = name;
		System.out.println("Puppy with name " + name + " is created");
	}

	public int getPuppyAge() {
		return puppyAge;
	}

	public void setPuppyAge(int puppyAge) {
		this.puppyAge = puppyAge;
	}
	
	
}
