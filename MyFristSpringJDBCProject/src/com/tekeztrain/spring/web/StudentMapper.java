package com.tekeztrain.spring.web;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>
{
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Student student = new Student();
		student.setId(rs.getInt("id"));
		student.setFirstName(rs.getString("firstName"));
		student.setLastName(rs.getString("lastName"));
		return student;
	}
}
