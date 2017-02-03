package com.tekeztrain.spring.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import com.tekeztrain.spring.web.Student;



public interface StudentDao 
{
	public void setDataSource(DataSource dataSource);
	
	public void create(Student student);
	
	public Student getStudentId(Integer id);
	
	public List<Student> listStudents();
	
	public void delete(Integer id);
	
	public void update(Integer id, Student student);
}
