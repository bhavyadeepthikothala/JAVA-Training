package com.tekeztrain.spring.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tekeztrain.spring.dao.StudentDao;
import com.tekeztrain.spring.web.Student;
import com.tekeztrain.spring.web.Student.Gender;

@Controller

public class RegistrationController 
{
	/*@RequestMapping(value="/register" , method = RequestMethod.GET)
	public ModelAndView register() throws ServletException, IOException
	{
		 //For ClassPathXmlApplicationContext to work we need to copy the Myapp-servlet.xml file 
		 //into src directory because the Spring cannot identify some file that is not in the class path  
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("Myapp-servlet.xml");
		//Student student = (Student)context.getBean("student");
		
		Student student = new Student();
		student.setUserName("Bhavya");
		
		return new ModelAndView("register" , "student", student); 
		
	}
	
	@RequestMapping(value="/register" , method = RequestMethod.POST)
	public ModelAndView processRegistration(Student student) 
			throws ServletException, IOException
	{		
		
		System.out.println("you are: " + student.getFirstName() +"," + student.getLastName());
		//return new ModelAndView("register" , "student", student); 
		String message= "You hav now successfully registered. Please login";
		return new ModelAndView("home" , "message", message);
		
	}*/
	
	
	/*FOR EXCERCISE 8
	 * 
	 *
	@ModelAttribute("genders")
	public Gender[] getGenders()
	{
		return Gender.values();
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	
	public ModelAndView register(Model model)
	{
		Student student = new Student();
		student.setFirstName("Bhavya");
		student.setGender(Gender.FEMALE);
		model.addAttribute("student",student);
		return new ModelAndView("register", "student",student);
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	
	public ModelAndView processRegistration(@ModelAttribute Student student, Model model)
	{
		System.out.println(student.toString());
		return new ModelAndView("register");
	}*/
	
	@Autowired
	private StudentDao studentDao;
	
	@ModelAttribute("genders")
	public Gender[] getGenders()
	{
		return Gender.values();
	}
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	
	public ModelAndView register(Model model)
	{
		Student student = new Student();
		//student.setFirstName("Bhavya");
		System.out.println("gender exists: " + model.containsAttribute("genders"));
		return new ModelAndView("register", "student", student);
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	
	public ModelAndView processRegistration(@Valid @ModelAttribute Student student, Model model, Errors errors)
	{
		if(errors.hasErrors())
		{
			return new ModelAndView("register");
		}
		studentDao.create(student);
		System.out.println(student.toString());
		return new ModelAndView("register");
	}
}
