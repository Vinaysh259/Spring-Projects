package com.wipro.testdb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Setup connection variable
		String user = "vinay";
		String pass= "1234";
		
		String jdbcurl = "jdbc:mysql://localhost/web_customer_tracker?useSSL=false&serverTimeZone=UTC";
		
		String driver = "com.mysql.cj.jdbc.Driver";
		
		//Get a connection to the database
		try {
			
			PrintWriter out = response.getWriter();
			out.println("Connecting to database");
			
			Class.forName(driver);
			
			Connection connection = DriverManager.getConnection(jdbcurl,user,pass);
			
			out.println("Successfull!!!!!!!!");
			
			connection.close();
		}
		
		catch(Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
	}

}
