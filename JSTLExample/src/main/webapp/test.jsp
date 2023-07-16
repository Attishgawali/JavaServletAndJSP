<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
</head>
<body>
	<h1>this is test page</h1>
	<c:out value="${i}"></c:out> <!-- As the scope of variable i set to application hence it is available over application -->
</body>
</html>