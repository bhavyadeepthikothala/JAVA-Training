package com.tekeztrain.spring.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.tekeztrain.spring.dao.StudentDao;
import com.tekeztrain.spring.web.Student;
import com.tekeztrain.spring.web.StudentMapper;

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
		String sql = "INSERT INTO student (firstName, lastName, dob, emailId, gender, address, userName, password)"
				   + " VALUES (? , ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, student.getFirstName(), student.getLastName(), student.getDob(),
							student.getEmail(), student.getGender().name(), student.getAddress().toString(),
							student.getUserName(), student.getPassword());
		System.out.println("Student record created");
		return;
	}

	@Override
	public Student getStudentId(Integer id)
	{
		// TODO Auto-generated method stub
		
		String sql ="SELECT * FROM student WHERE id = ?";
		Student student = jdbcTemplate.queryForObject(sql, new Object[]{id}, new StudentMapper());				
		return student;
	}

	@Override
	public List<Student> listStudents() 
	{
		// TODO Auto-generated method stub
		String sql ="SELECT * FROM student WHERE id < 100";
		List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
		return students;
	}

	@Override
	public void delete(Integer id) 
	{
		// TODO Auto-generated method stub
		String sql ="DELETE FROM student WHERE id = ?";
		jdbcTemplate.update(sql,id);
		System.out.println("Deleted record with id = " + id);
		return;
	}

	@Override
	public void update(Integer id, Student student)
	{
		// TODO Auto-generated method stub
		String sql ="UPDATE student SET address=? WHERE id = ?";
		jdbcTemplate.update(sql,student.getAddress().toString(),id);
		System.out.println("updated record with id = " + id);
		return;
	}

}
