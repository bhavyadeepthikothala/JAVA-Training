package com.tekeztrain.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependencyInjection {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Student student = (Student)context.getBean("student");
		
		Address address = student.getAddress();
		address.setNumber(3404);
		address.setStreet("StoneCliffe Dr.");
		address.setCity("Monroeville");
		address.setState("PA");
		address.setZip(15146);
		
		student.setAddress(address);
	}

}
