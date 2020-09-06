<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Myfirstpage home</title>
</head>
<body>
	<h1>Welcome to my first dynamic web project..</h1>
	<a href="<%= request.getContextPath() %>/EmployeeServlet">Refresh Page</a>
	
	
	<form action="<%= request.getContextPath() %>/EmployeeServlet" method="POST">
		<input type="submit" value="Get Data"/>
	</form>
	
	
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Salary</td>
			<td>First Name</td>
			<td>Last Name</td>
		</tr>
		
		<tr>
			<td>5</td>
			<td>12355</td>
			<td>John</td>
			<td>Rnad</td>
		</tr>
		
		
	</table>
	
</body>
</html>