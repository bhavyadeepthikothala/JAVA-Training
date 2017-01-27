package com.tekeztrain.spring;

import org.springframework.stereotype.Component;

@Component("address")

public class Address 
{
	private int number;
	private String street;
	private String city;
	private String state;
	private long zip;
	
	public int getNumber() 
	{
		return number;
	}
	
	public void setNumber(int number) 
	{
		this.number = number;
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public void setStreet(String street) 
	{
		this.street = street;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getState() 
	{
		return state;
	}
	
	public void setState(String state) 
	{
		this.state = state;
	}
	
	public long getZip() 
	{
		return zip;
	}
	
	public void setZip(long zip) 
	{
		this.zip = zip;
	}
	
}
