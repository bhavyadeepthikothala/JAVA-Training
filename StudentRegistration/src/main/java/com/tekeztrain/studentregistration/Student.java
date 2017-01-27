package com.tekeztrain.studentregistration;

import java.util.*;

public class Student 
{
	private int id;
	private String firstName;
	private String lastName;
	//private Gender gender;
	private char gender;
	private Date dob;
	private String emailID;
	private String userName;
	private String password;
	
	public Student()
	{
		
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
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
	
	public char getGender() 
	{
		return gender;
	}
	
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	
	public Date getDob() 
	{
		return dob;
	}
	
	public void setDob(Date dob) 
	{
		this.dob = dob;
	}
	
	public String getEmailID() 
	{
		return emailID;
	}
	
	public void setEmailID(String emailID) 
	{
		this.emailID = emailID;
	}
	
	public String getUserName() 
	{
		return userName;
	}
	
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	

}
