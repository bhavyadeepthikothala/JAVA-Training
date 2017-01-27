<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- This is page Directive Example --%>
    <%@ page import = "java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Success</title>
</head>
<body>
	<p>
		<%
				out.println("date is : "+ date );
		%>
		<br>
		<%-- This is example for declaration tag --%>
	    <%!
	    	Date date = new Date();
	    %>
	    
		<%
			out.println(session.getAttribute("SuccessMessage"));
		%>
		<br>
		<%
			out.println(date +"\n");
		%>
		<br>
		<%-- Example for Expression tag --%>
		<%= (2+3) %>
		<br>
		this month is
		<%= date.getDate() %>
	</p>
</body>
</html>