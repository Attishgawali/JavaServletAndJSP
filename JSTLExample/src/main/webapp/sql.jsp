<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<h1>this JSTL SQL</h1>

	<sql:setDataSource driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/javaServlet" user="root"
		password="root12345" var="ds" />

	<sql:query dataSource="${ds}" var="rs">select * from user;</sql:query>

	
	<div class="container">
		<table class="table">
		<tr>
			<td>User ID</td>
			<td>User Name</td>
			<td>User Password</td>
		</tr>
		<c:forEach var="row" items="${rs.rows}">
			<tr>
				<td><c:out value="${row.id}"></c:out></td>
				<td><c:out value="${row.username}"></c:out></td>
				<td><c:out value="${row.password}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	</div>
	

</body>
</html>