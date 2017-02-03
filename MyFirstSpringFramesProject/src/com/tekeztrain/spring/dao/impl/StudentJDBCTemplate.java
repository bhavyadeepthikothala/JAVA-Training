package com.tekeztrain.spring.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.tekeztrain.spring.dao.StudentDao;
import com.tekeztrain.spring.web.Student;

@Component
public class StudentJDBCTemplate implements StudentDao
{
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource)
	{
		this.jdbcTemplate= new JdbcTemplate(dataSource);
	}
	
	@Override
	public void create(Student student) 
	{
		// TODO Auto-generated method stub
		String sql = "INSER INTO student (userName, password) VALUES (? , ?)";
		jdbcTemplate.update(sql, student.getUserName(), student.getPassword());
		System.out.println("Student record created");
		return;
	}

	@Override
	public Student getStudentId(Integer id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listStudents() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Integer id, Student student)
	{
		// TODO Auto-generated method stub
		
	}

}
