package com.tekeztrain.spring;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("student")
public class Student 
{
	private String firstName;
	private String lastName;
	private int id;
	private Date dob;
	private char gender;
	@Autowired
	private Address address;
	
	public Student()
	{
		
	}
	
	/*public Student(Address address)
	{
		this.address= address;
	}*/
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public Date getDob()
	{
		return dob;
	}
	
	public void setDob(Date dob) 
	{
		this.dob = dob;
	}
	
	public char getGender() 
	{
		return gender;
	}
	
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	
	public Address getAddress() 
	{
		return address;
	}
	
	public void setAddress(Address address) 
	{
		this.address = address;
	}
	
}
