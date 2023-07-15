<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");//this for HTTP 1.1

	response.setHeader("Pragma", "no-cache"); // for older version of http 1.0
			
	response.setHeader("Expires","0"); //for proxies

	if (session.getAttribute("username") == null) {
		response.sendRedirect("login.jsp");
	}
	%>
	Welcome ${username}
	<a href="Videos.jsp">See videos Here</a>
	<form action="Logout">
		<button type="submit" value="Logout">Logout</button>
	</form>
</body>
</html>