<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<input type="number" name="eid" value=<%= request.getParameter("id") %>>
<input type="text" name="ename" value=<%=request.getParameter("name") %>>
<input type="text" name="pos" value=<%=request.getParameter("pos")  %>>
<input type="number" name="sal" value=<%=request.getParameter("sal") %>>
<button>Submit</button>
</form>
</body>
</html>