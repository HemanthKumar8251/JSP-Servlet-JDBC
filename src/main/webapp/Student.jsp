<%@page import="com.hemanth.web.modle.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Info</title>
</head>
<body>
	<%
		Student s1 = (Student)request.getAttribute("student");
		out.print(s1);
	%>
</body>
</html>