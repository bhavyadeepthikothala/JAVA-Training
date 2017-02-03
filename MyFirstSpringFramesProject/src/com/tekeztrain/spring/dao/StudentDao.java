package com.tekeztrain.spring.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tekeztrain.spring.web.Student;



public interface StudentDao 
{
	public void create(Student student);
	public Student getStudentId(Integer id);
	public List<Student> listStudents();
	public void delete(Integer id);
	public void update(Integer id, Student student);
}
