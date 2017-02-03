package com.tekeztrain.spring.web;

import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Login 
{
	@Size(min=5, max=15)
	private String userName;
	
	@Size(min=6, max=12)
	private String password;
	
	public Login()
	{
		
	}
	
	public Login(String userName, String password) 
	{
		super();
		this.userName = userName;
		this.password = password;
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
