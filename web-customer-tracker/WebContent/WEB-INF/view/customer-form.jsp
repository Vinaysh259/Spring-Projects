<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/customer-form.css">
<title>Customer form</title>

</head>
<body>
	
	<div id = "wrapper">
		<div id = "header">
			<h1>CRM - Customer Relationship Manager </h1>
		</div>
	</div>
	
	
	<div id="container">
		<h2>Save Customer</h2>
		
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
			<form:hidden path="id"/>
			<table>
				<tbody>
					<tr>
						<td><label>First Name :</label> </td>
						<td>
							<form:input path="firstName"/>
						 </td>
					</tr>

					<tr>
						<td><label>Last Name :</label> </td>
						<td>
							<form:input path="lastName"/>
						 </td>
					</tr>

					<tr>
						<td><label>Email :</label> </td>
						<td>
							<form:input path="email"/>
						 </td>
					</tr>
					
					<tr id="submit">
						<td><input type="submit" value="Save"> </td>
					</tr>
				
				</tbody>
			
			</table>
		
		</form:form>
		
		<div style="clear; both;"></div>
		<p>
			<a href="${pageContext.request.contextPath }/customer/list">Back to List</a>
		 </p>
	</div>
</body>
</html>