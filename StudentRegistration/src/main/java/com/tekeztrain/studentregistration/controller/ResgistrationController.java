package com.tekeztrain.studentregistration.controller;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tekeztrain.studentregistration.Student;

/**
 * Servlet implementation class ResgistrationController
 */
public class ResgistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3000/tekez";
	private static final String userName =  "root";
	private static final String password = "root";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResgistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setFirstName("Bhavya");
		request.setAttribute("student", student);
		RequestDispatcher rd  = request.getRequestDispatcher("register.jsp");
		rd.forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getAttribute("student") != null)
		{
			Student student = (Student)request.getAttribute("student");
			System.out.println("your name is " + student.getFirstName());
		}
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		Student student = new Student();
		student.setUserName(userName);
		student.setPassword(password);
		
		boolean result = registerStudent(student);
		RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
		String message = "you are now Successfully registered";
		if(!result)
		{
			message = "Your registration failed";
			rd= request.getRequestDispatcher("register.jsp");
		}
		
		request.setAttribute("message", message);
		rd.forward(request, response);
		doGet(request, response);
	}
	
	@SuppressWarnings("finally")
	private boolean registerStudent(Student student)
	{
		Connection conn = null;
		Statement stmt =  null;
		boolean insertResult = false;
		try
		{
			//register the driver
			Class.forName(JDBC_DRIVER);
			
			//get the connection from DriverManager
			conn = DriverManager.getConnection(DB_URL, userName, password);
			
			//create a statement
			stmt = conn.createStatement();
			
			String sql = "INSERT INTO studentdetails(userName, password) VALUES('" 
							+ student.getUserName() + "','" + student.getPassword() + "')";
			
			//execute the statement
			int result = stmt.executeUpdate(sql);
			
			if(result == 1)
			{
				insertResult = true;
				System.out.println("Student Record inserted Successfully");
			}
			
			//close statement and connection
			stmt.close();
			conn.close();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			return insertResult;
		}
		
		
	}

}
