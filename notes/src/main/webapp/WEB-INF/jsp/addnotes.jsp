<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add notes</title>
</head>
<body>
<form action="addnotes" method="get">
	<input type="text" name="name" placeholder="Name of your note">
	<br>
	<hr>
	<textarea rows="3" cols="5" name="subject" placeholder="Description of note"></textarea>
	<br>
	<hr>
	<input type="submit">
</form>
<hr>
<a href="homepage">Back to home</a>
</body>
</html>