<%@ page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.ServletRequest"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<%! int result; %>
	<%
	try {
		// Code that may throw an exception
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		result = n1 / n2;
	} catch (Exception e) {
		// Log the error
		System.err.println("An exception occurred: " + e.getMessage());

		// Redirect to the error page
		
		response.sendRedirect("error.jsp");
	}
	%>

	<h1 class="display-3" >Result is : <%=result %></h1>
	
	<a class="btn btn-outline-primary" href="index.jsp">Home Page</a>
</body>
</html>