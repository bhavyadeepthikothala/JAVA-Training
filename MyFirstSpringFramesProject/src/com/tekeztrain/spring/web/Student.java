package com.tekeztrain.spring.web;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;


@Component("student")
public class Student 
{
	@Size(min=2, max =10)
	private String firstName;
	
	@Size(min=2, max =10)
	private String lastName;
	
	private int id;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@NotNull @Past
	private Date dob;
	
	@NotNull
	private Gender gender;
	
	@Size(min=5, max=10)
	private String userName;
	
	@NotEmpty @Email
	private String email;
	
	@Size(min=6, max=12)
	private String password;
	
	public enum Gender
	{
		MALE, FEMALE
	}
	
	@Autowired
	private Address address;
	
	public Student()
	{
		
	}
	
	/*public Student(Address address)
	{
		this.address= address;
	}*/
	
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
	
	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public void setPassword(String password) 
	{
		this.password = password;
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
	
	public Gender getGender() 
	{
		return gender;
	}
	
	public void setGender(Gender gender)
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
	
	public String toString()
	{
		return firstName + " " + lastName + " is a " + gender;
	}
	
}
