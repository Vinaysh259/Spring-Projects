<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main menu</title>
</head>
<body>
	<h2>Spring MVC Demo - Home page</h2>
	
	<br>
	<a href="showForm">Hello world form</a>
	<br>
	<br>
	<a href="student/showForm">Student Registration Form</a>
	<br>
	<br>
	<a href="customer/showForm">Customer form</a>	
	
	
	<img src="${pageContext.request.contextPath}/resources/images/spring.png">
</body>
</html>