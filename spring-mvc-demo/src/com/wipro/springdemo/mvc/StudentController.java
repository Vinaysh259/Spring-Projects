package com.wipro.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		
		//Create a student object
		Student theStudent = new Student();
		
		//Add student object to the model
		model.addAttribute("student",theStudent);
		
		return "student-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("First Name :" + theStudent.getFirstName() + 
							" Last Name : " + theStudent.getLastName());
		
		return "student-confirmation";
	}
}
