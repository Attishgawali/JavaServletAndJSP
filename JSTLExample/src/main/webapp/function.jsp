<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This JSTL Function</h1>
	<c:set var="text" value="Hello, World!" />
	<c:out value="${text}"></c:out>

	<p>Length of the text: <c:out value="${fn:length(text)}" /></p>
	<p>Substring from index 7 to 12: <c:out value="${fn:substring(text, 7, 12)}" /></p>
	<p>Lowercase text: <c:out value="${fn:toLowerCase(text)}" /></p>
	<p>Uppercase text: <c:out value="${fn:toUpperCase(text)}" /></p>
	<p>Trimmed text: <c:out value="${fn:trim(text)}" /></p>
	<p>Replaced text: <c:out value="${fn:replace(text, 'Hello', 'Hi')}" /></p>
	<p>Text contains 'World': <c:out value="${fn:contains(text, 'World')}" /></p>
	<p>Text starts with 'Hello': <c:out value="${fn:startsWith(text, 'Hello')}" /></p>
	<p>Text ends with '!': <c:out value="${fn:endsWith(text, '!')}" /></p>
</body>
</html>