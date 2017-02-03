package com.tekeztrain.spring.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/*This is step 8 from  Creating SpringWeb Project
@Controller
//@RequestMapping(value="/hello")

public class HelloController
{
	@RequestMapping(value="/hello" , method = RequestMethod.GET)
	public String welcome(HttpServletRequest request, HttpServletResponse response)
	{
		return "/hello.jsp";
	}
	
	@RequestMapping(value="/hello", method = RequestMethod.POST)
	public String processRequest(HttpServletRequest request, HttpServletResponse response)
	{
		return "/hello.jsp";
	}
}*/

/*This is step 9

@Controller

public class HelloController
{
	@RequestMapping(value="/hello" , method = RequestMethod.GET)
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response)
	{
		 return new ModelAndView("hello" , "user","Bhavya"); 
	}
}
*/

/* This shows how to read URL Parameters step 10
@Controller

public class HelloController
{
	@RequestMapping(value="/hello" , method = RequestMethod.GET)
	public ModelAndView welcome(@RequestParam(value = "name" , required = false) String userName)
	{
		 return new ModelAndView("hello" , "user", userName); 
	}
}
*/

/* This shows about Path Variables step 11
@Controller

public class HelloController
{
	@RequestMapping(value="/hello/{name}" , method = RequestMethod.GET)
	public ModelAndView welcome(@PathVariable("name") String userName)
	{
		 return new ModelAndView("hello" , "user", userName); 
	}
}
*/

// Using Beans in the Program
 
//@Controller

public class HelloController
{
	@RequestMapping(value="/hello/{name}" , method = RequestMethod.GET)
	public ModelAndView welcome(@PathVariable("name") String userName)
	{
		 return new ModelAndView("hello" , "user", userName); 
	}
	
	@RequestMapping(value="/register" , method = RequestMethod.GET)
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
}

/* Created a new file called Registration Controller
 
@Controller

public class HelloController
{
	@RequestMapping(value="/hello/{name}" , method = RequestMethod.GET)
	public ModelAndView welcome(@PathVariable("name") String userName)
	{
		 return new ModelAndView("hello" , "user", userName); 
	}
	
	@RequestMapping(value="/register" , method = RequestMethod.POST)
	public ModelAndView processRegistration(Student student) 
			throws ServletException, IOException
	{
		//ApplicationContext context = new ClassPathXmlApplicationContext("Myapp-servlet.xml");
		//Student student = (Student)context.getBean("student");
				
		System.out.println("you are: " + student.getFirstName() +"," + student.getLastName());
		return new ModelAndView("register" , "student", student); 

	}
}
*/