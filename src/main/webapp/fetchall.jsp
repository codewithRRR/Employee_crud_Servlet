
<%@page import="servlet_crud1.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	<%
	List<Employee> list = (List<Employee>) request.getAttribute("o");
	%>
	<h2>Employee List</h2>
	<table border="1" style="color: red;">
		<tr>
			<th>EId</th>
			<th>Name</th>
			<th>Posititon</th>
			<th>Salary</th>
			<th>Delete</th>
			<th>update</th>
		</tr>
		<tr>
			<%
			for (Employee em : list) {
			%>
			<td><%=em.getEmp_id()%></td>
			<td><%=em.getE_name()%></td>
			<td><%=em.getPosition()%></td>
			<td><%=em.getSalary()%></td>
			<td><a href="deletebyId?sid=<%=em.getEmp_id()%>">Delete</a></td>
			<td><a
				href="update.jsp?id=<%=em.getEmp_id()%>&&name=<%=em.getE_name()%>&&pos=<%=em.getPosition()%>&&sal=<%=em.getSalary()%>">update</a></td>
		</tr>
		<%
		}
		%>
	</table>


</body>
</html>
<!-- When the user clicks the "delete" link, the browser will make a request to something like:
http://yourserver/deletebyid?sid=123 -->
