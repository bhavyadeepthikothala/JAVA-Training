package com.tekeztrain.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSquare 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		Square square = (Square)context.getBean("square");
		System.out.println("Area of the square is = "+ square.findArea());

	}

}
