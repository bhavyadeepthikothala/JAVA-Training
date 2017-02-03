<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple Registration Application for TekEZTrain - Login Page</title>

<style>

	body
	{
		background-color:#eee;
		font:helvetica;
	}

	#container
	{
		width:500px;
		background-color:#fff;
		margin:30px auto;
		padding:30px;
		border-radius:5px;
		box-shadow:5px;
	}

	.green
	{
		font-weight:bold;
		color:green;
	}

	.message
	{
		margin-bottom:10px;
	}
 
 	label
	{
		width:120px;
		display:inline-block;
	}

	form
	{
		line-height:160%;
	}

	.hide
	{
		display:none;
	}

	.error
	{
		color:#ff0000;
		font-style:itallic;
		font-weight:bold;
	}
</style>

</head>
<body>

	<div id="container">
		<h2> Welcome to Student Registration Page</h2>
		
		<c:if test="${not empty message}"><div class="message green">${message}</div></c:if>
		
		<form:form modelAttribute="login" method="post" action="processLogin"> 
		
			<label for="userName">User Name: </label>
			<form:input  path="userName" id="userNameInput" /> &nbsp;&nbsp;<form:errors path="userName" cssClass="error" /> <br/>
			
			<label for="password">password: </label>
			<form:password path="password" id="passwordInput" /> &nbsp;&nbsp;<form:errors path="password" cssClass="error" /> <br/>
			
			<input type="submit" value="Submit">
			
		</form:form>
		
	</div>
</body>
</html>