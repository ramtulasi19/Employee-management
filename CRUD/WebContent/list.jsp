<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Employees</title>
</head>
<body>
	<%
ArrayList<Employee> elist=(ArrayList<Employee>)request.getAttribute("List");
if(elist!=null){
%>
	<div id="page">
		<div id="header">
			<h1 align="center">Employee List</h1>
		</div>
		<div id="content">
			<br> <br>
			<table align="center" border="1" width="50%">
				<tr>
					<th>Employee id</th>
					<th>Name</th>
					<th>Age</th>
					<th>Salary</th>
				</tr>
				<% for(Employee e:elist){ %>
				<tr>
					<td><%=e.getEmpId()%></td>
					<td><%=e.getName()%></td>
					<td><%=e.getAge()%></td>
					<td><%=e.getSalary()%></td>
				</tr>
				<%} %>
			</table>
			<%} %>
			<br> <br>
			<center>
				<a href="home.html">Home</a>
			</center>
</body>
</html>