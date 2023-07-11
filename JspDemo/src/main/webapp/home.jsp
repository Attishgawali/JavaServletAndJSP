<!-- DERACTICVE TAG (this tag is use for import the packages) -->
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Random,java.sql.Statement,java.lang.*" %>
<%@page import="java.util.ArrayList" %>
<%@page isELIgnored="false" %>
<%@page errorPage="error.jsp" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- DECLARATIVE TAG (include another jsp file)-->
	<%@include file="header.jsp" %>
	
	
	<!-- DECLARATION TAG (the code inside declration tag does not goes inside service method) -->
	<%!
		int coeff = 3;
		//int k = 9/0;  //we know this will throw error and it is handle by error.jsp page
	%>
	
	<!-- SCRIPTLET TAG (the code inside scriptlet tag goes inside service method) -->
	<% 
		int i=9;
		int j = i*coeff;
		
	%>
	
	
	<!-- EXPRESSION TAG (the code inside Expression tag goes inside out.println()method to show on pages) -->
	<%= i %><br>
	the value of coefficient <%=j %><br>
	
	<c:set var="name" value="Attish"></c:set>
	<c:out value="${name}"></c:out>

</body>
</html>