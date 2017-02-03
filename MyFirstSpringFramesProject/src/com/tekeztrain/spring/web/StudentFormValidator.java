package com.tekeztrain.spring.web;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class StudentFormValidator implements Validator
{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Student.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		//ValidationUtils.rejectIfEmpty(errors, "userName", "userName.Required", "UserName cannot be empty");	
	}
	

}
