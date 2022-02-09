<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ include file="../global/theme/header.jsp" %> 
<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg);"   > 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>

				Data Received <br>
				
				${clientRegistrationModel} 
				<br>
				
				${clientRegistrationModel.firstName} 
				<br>
				
				${clientRegistrationModel.lastName} 
				<br>
				
				${clientRegistrationModel.emailAddress} 
				
				<br>
				
				${clientRegistrationModel.password} 
				
					
</body>
</html>