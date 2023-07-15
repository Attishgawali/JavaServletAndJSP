<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="post">
		Enter your Name: <input type="text" name="username"><br>
		Enter your Password: <input type="password" name="password"><br>
		<button type="submit">Login</button> <br> 
	</form>
	
	<p>If you are new user Register Here</p>
	<form action="Register.jsp" method="post">
		<button type="submit">Register</button> <br> 
	</form>
</body>
</html>