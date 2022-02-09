<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>

<form:form method="POST" action="/register">
<form:input path="firstName"  />
<form:input path="lastName"  />
<form:input path="emailAddress"  />
<form:input path="password"  />



</form:form>

</body>
</html>