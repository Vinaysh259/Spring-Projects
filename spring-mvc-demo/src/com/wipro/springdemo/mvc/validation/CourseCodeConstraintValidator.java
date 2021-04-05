package com.wipro.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	 
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		// TODO Auto-generated method stub
		
		boolean result;
		
		if(theCode != null) {
			result = theCode.startsWith("udemy");
		}
		
		else {
			result = true;
		}
		
		return result;
	}


}
