package com.tekeztrain.spring;

import org.springframework.stereotype.Component;

@Component("square")

public class Square 
{
	private double side;

	public double getSide() 
	{
		return side;
	} 

	public void setSide(double side)
	{
		this.side = side;
	}
	
	public double findArea()
	{
		return side*side;
	}
}
