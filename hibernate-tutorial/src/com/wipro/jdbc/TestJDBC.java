package com.wipro.jdbc;

import java.sql.Connection;

import java.sql.DriverManager;

public class TestJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcurl = "jdbc:mysql://localhost/hb_student_tracker?useSSL=false&serverTimeZone=UTC";
		String user = "vinay";
		String pwd = "1234";
		
		
		try {
			
			System.out.println("Connecting to database.............");
			Connection connection = DriverManager.getConnection(jdbcurl, user, pwd);
			System.out.println("Connected to hb_student_tracker database!!!!!!!!!");
		} 
		
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
