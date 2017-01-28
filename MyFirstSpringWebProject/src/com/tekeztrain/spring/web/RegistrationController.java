package com.tekeztrain.spring.web;

import java.io.IOException;

import javax.servlet.ServletException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class RegistrationController 
{
	@RequestMapping(value="/register" , method = RequestMethod.GET)
	public ModelAndView register() throws ServletException, IOException
	{
		 //For ClassPathXmlApplicationContext to work we need to copy the Myapp-servlet.xml file 
		 //into src directory because the Spring cannot identify some file that is not in the class path  
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("Myapp-servlet.xml");
		//Student student = (Student)context.getBean("student");
		
		/*Student student = new Student();
		student.setUserName("Bhavya");*/
		
		return new ModelAndView("register" /*, "student", student*/); 
		
	}
	
	@RequestMapping(value="/register" , method = RequestMethod.POST)
	public ModelAndView processRegistration(Student student) 
			throws ServletException, IOException
	{		
		
		System.out.println("you are: " + student.getFirstName() +"," + student.getLastName());
		//return new ModelAndView("register" , "student", student); 
		String message= "You hav now successfully registered. Please login";
		return new ModelAndView("home" , "message", message);
		
	}
}
