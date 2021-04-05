package com.wipro.employee.setterinjection;

public class Employee {	
	
	private int id;
	private String name;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("Id : " + id + "\n name : " + name);
	}

}
