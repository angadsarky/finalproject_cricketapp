<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
</head>
<body>
	<h1>Cricket App Home Page</h1><br>
	<h3>Match Schedule</h3><br>
	<c:forEach items="${schedule}" var="schedule">
		<h2><c:out value="${schedule}" />
		</h2><p>
	</c:forEach>
	<br><br><h2> </h2>
	<c:url var="myAction" value="checkChoice.obj"></c:url>
	<form:form action="${myAction}" method="get" modelAttribute="MatchID">
		Playing XI for match no. : <form:input path="MatchID"/><br>
		<input type="submit" value="Go">
	</form:form>
</body>
</html>