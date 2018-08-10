<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign Up</title>
</head>
<body>
	<h1>Enter New User Details</h1>
	<c:url var="myAction" value="checkSignUp.obj"></c:url>
	<form:form action="${myAction}" method="get" modelAttribute="signup">
		Username : <form:input path="login"/><br>
		Password : <form:input path="password"/><br>
		<input type="submit" value="SIGN UP">
	</form:form>	
</body>
</html>