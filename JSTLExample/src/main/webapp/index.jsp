<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>this is JSTL example</h1>

	<!-- SET TAG-->
	<c:set var="i" value="-223" scope="application"></c:set>


	<!-- OUT TAG -->
	<h1>
		<c:out value="${i}"></c:out>
	</h1>


	<!-- REMOVE TAG -->
	<!-- <c:remove var="i"/> -->

	<!-- IF TAG -->
	<c:set var="i" value="0" scope="application"></c:set>
	<c:if test="${i==0}">
		<h2>condition is true</h2>
	</c:if>


	<!-- CHOOSE WHEN OTHERWISE LIKE JAVA SWITCH -->
	<c:set var="i" value="0" scope="application"></c:set>
	<c:choose>
		<c:when test="${i>0}">
			<h2>this is first case</h2>
			<h2>Number is Positive</h2>
		</c:when>
		<c:when test="${i<0}">
			<h2>this is Second case</h2>
			<h2>Number is Negative</h2>
		</c:when>
		<c:otherwise>
			<h2>Default case ..otherwiese</h2>
			<h2>the number is zero</h2>
		</c:otherwise>
	</c:choose>


	<!-- FOREACH TAG -->
	
	<c:forEach var="j" begin="1" end="10" >
		<h1>value of j : <c:out value="${j}"></c:out></h1>
	</c:forEach>
	
	
	

</body>
</html>