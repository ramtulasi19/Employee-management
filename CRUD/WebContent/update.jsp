<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update</title>
</head>
<body>
	<%Employee e=(Employee)request.getAttribute("emp"); %>
	<center>
		<h1>Enter Employee Details to be updated</h1>
		<br>
		<form action="EmployeeServlet">
			<table align="center" border="1">
				<tr>
					<th>Employee id</th>
					<td><input type=text name="id"></td>
				</tr>
				<tr>
					<th>Name<font color="Red">*</font></th>
					<td><input type=text name="name"></td>
				</tr>
				<tr>
					<th>Age<font color="Red">*</font></th>
					<td><input type=number name="age"></td>
				</tr>
				<tr>
					<th>Salary <font color="Red">*</font></th>
					<td><input type=number name="salary"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><Input type="submit"
						name="action" value="update"> <input type="reset"
						name="reset"></td>
				</tr>
			</table>
		</form>
		<br> <a href="home.html">Home</a><br>
	</center>
</body>
</html>