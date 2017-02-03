<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Simple Registration Application for TekEZTrain </title>

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
		
		<form:form modelAttribute="student" method="post"> 
		
			<label for="firstName"> First Name:  </label>
			<form:input path="firstName" id="firstNameInput" /> &nbsp; &nbsp; 
			    <form:errors path ="firstName" cssClass="error" /> <br/>
			
			<label for="lastName"> Last Name:  </label>
			<form:input path="lastName" id="lastNameInput" /> &nbsp; &nbsp; 
			    <form:errors path ="lastName" cssClass="error" /> <br/>
			
			<label for="genderSelect"> Gender:  </label>
			<!-- creating a drop down list -->
			<form:select path="gender" id="genderSelect" >
			<!--  for loop in jsp -->
				<c:forEach items="${genders}" var="gender">
					<!--  options inside the drop down list -->
					<form:option value="${gender}">${gender}
						<!--this actually prints the options on the screen like male /female provided by controller-->
					</form:option>
				</c:forEach>
			</form:select> <br/>
			
			<label for="street">Street:  </label>
			<form:input path="address.number" id="streetNumberInput" style="width:60px;"/>&nbsp;&nbsp;					
			<form:input path="address.street" id="streetInput" /><br/>
			
			<label for="city">City: </label>
			<form:input path="address.city" id="cityInput" /> <br/>			
			
			<label for="state">State: </label>
			<form:input path="address.state" id="stateInput" /> <br/>
			
			<label for="zip">Zip: </label>
			<form:input  path="address.zip" id="zipInput" /> <br/>		
							
			<label for="userName">User Name: </label>
			<form:input  path="userName" id="userNameInput" /> &nbsp;&nbsp;<form:errors path="userName" cssClass="error" /> <br/>
			
			<label for="password">password: </label>
			<form:password path="password" id="passwordInput" /> &nbsp;&nbsp;<form:errors path="password" cssClass="error" /> <br/>
			
			
			<input type="submit" value="Submit">
			
		</form:form>	
	</div>
	
	<%-- <form method="post">
	
		<!--UserName: <input type = "text" name="userName"   value="${student.userName}" /><br/>-->
		UserName: <input type = "text" name="userName"/><br/>
		FirstName: <input type = "text" name="firstName" /><br/>
		LastName: <input type = "text" name="lastName" /><br/>
		Password: <input type = "text" name="password" /><br/>
		<input type="submit" value="submit"/>
		
	</form>  --%>
</body>
</html>