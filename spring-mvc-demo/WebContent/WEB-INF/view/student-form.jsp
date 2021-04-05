<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		
		First Name : <form:input path="firstName"/>
		
		<br> <br>
		Last Name : <form:input path="lastName"/>
		
		<br> <br>
		Country : <form:select path="country">
					
<%-- 					<form:option value="India" label="India"></form:option>
					<form:option value="United States" label="USA"></form:option>
					<form:option value="Brazil" label= "Brazil"></form:option>
					<form:option value="Spain" label="Spain"></form:option> --%>
					
					<form:options items="${student.countryOptions}"/>
						
				  </form:select>
		
		<br> <br>
		
		Favorite Language :
		<br>
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
		Verilog <form:radiobutton path="favoriteLanguage" value="Verilog"/>

		
		<br> <br>
		
		Operating Systems:
		
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		MacOS <form:checkbox path="operatingSystems" value="MacOS"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		
		<br> <br>
		<input type="submit" value="Submit" />
		
		<br> <br>
	</form:form>
</body>
</html>