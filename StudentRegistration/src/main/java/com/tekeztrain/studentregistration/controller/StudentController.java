package com.tekeztrain.studentregistration.controller;

import java.io.IOException;
import java.util.Date;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super(); // this basically calls the init method(my notes)
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*System.out.println("Hello World");*/
		String userName = request.getParameter("userName");
		String city = request.getParameter("city");
		Enumeration<String> params = request.getParameterNames();
 		/*String[] locations = request.getParameterValues("location"); 
 		String myLocations ="";
 		for(int i = 0; i < locations.length; i++)
 		{
 			myLocations += locations[i];
 			if(i < locations.length - 1)
 			{
 				myLocations += ","; 
 			}
 		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1> Hello "+ userName+" from "+ myLocations +"  Welcome Here!!!!! " +"</h1>");
		out.close();*/
		System.out.println("Date: " + new Date());
		System.out.println("QueryString: " + request.getQueryString());
		System.out.println("pathInfo: " + request.getPathInfo());;
		System.out.println("URI Requested: " + request.getRequestURI());
		System.out.println("URL Requested: " + request.getRequestURL());
		System.out.println("Remote Address: " + request.getRemoteAddr());
		System.out.println("Remote Port: " + request.getRemotePort());
		HttpSession session = request.getSession();
		System.out.println("My Session ID is " + session.getId());
		//ServletContext application = request.getServletContext();
		//application.setAttribute("SuccessMessage", "Hello, You logged in as Deepthi. Welcome ");
		//request.setAttribute("SuccessMessage", "Hello, You logged in as Kothala. Welcome ");
		//RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
		//rd.forward(request, response);
		
		session.setAttribute("SuccessMessage", "Hello, You logged in as Bhavya. Welcome");
		response.sendRedirect("Success.jsp");
		/* already written*/
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
