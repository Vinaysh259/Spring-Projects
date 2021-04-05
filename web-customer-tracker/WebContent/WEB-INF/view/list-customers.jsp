<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@	taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
<title>List customers</title>
</head>
<body>
	
	<div id = "wrapper">
		<div id = "header">
			<h1>CRM - Customer Relationship Manager </h1>
		</div>
	</div>
	
	
	<div id = "container">
		<div id = "content">
			
			
			<!-- Add input button for Save the customer -->
			<input type="button" value="Add Customer"
				onclick="window.location.href='showFormForAdd'; return false;"
				class="addButton"/>
					
			<!-- add your table here -->
			<table class="table1">
				<tr>
					<th>First Name	</th>
					<th>Last Name	</th>
					<th>Email </th>
					<th>Action </th>
				</tr>
				
				<c:forEach var="customer" items="${customers }">
				
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="tempId" value="${customer.id }"></c:param>
					</c:url>
					
					<c:url var="deleteLink" value="/customer/deleteCustomer">
						<c:param name="tempId" value="${customer.id }"></c:param>
					</c:url>
				
					<tr>
						<td>${customer.firstName} </td>
						<td>${customer.lastName} </td>
						<td>${customer.email }</td>
						<td>
							<a href="${updateLink }">Update</a> | <a href="${deleteLink }" onclick="if(!(confirm('Are you sure you want to delete this customer'))) return false;">Delete</a>
						</td>
						<td>
					</tr>
						
				</c:forEach>
			
			</table>
			
		</div>
	
	</div>

	
</body>
</html>