package com.wipro.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//Need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//Need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	
	//Add a new controller method to implement new version of form data
	@RequestMapping("/processFormVersionTwo")
	public String nameToUpperCase(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("studentName");
		
		String result = "Yo! " + name.toUpperCase();
		
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	

	
	@RequestMapping("/processFormVersionThree")
	public String nameToUpperCaseTwo(@RequestParam("studentName") String name, Model model) {
		
		String result = "Hey My friend from v3! " + name.toUpperCase();
		
		model.addAttribute("message",result);
		
		return "helloworld";
	}	
}
