<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Confirmation</title>
</head>
<body>
	
	The Customer is confirmed : ${customer.firstName} ${customer.lastName }
	<br> <br>
	Customer has ${customer.freePasses}  free Passes.
	
	<br> <br>
	Customer's postal code : ${customer.postalCode}.
	
	<br> <br>
	Course Code : ${customer.courseCode }
</body>
</html>