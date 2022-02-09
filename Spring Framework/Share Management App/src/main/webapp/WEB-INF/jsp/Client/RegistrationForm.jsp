<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg);"   > 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">   
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery-3.6.0.min.js"></script>
      <script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<title>Registration Form</title>
</head>
<body>

Data Received <br>

${clientRegistrationModel} 

<div class="div-center">


<form:form method="POST" action="Client/Register">






      	<table class="table div-center"" >  
      	<tr>
      	<th></th><th>Client Registration Form</th> 
        </tr> 
  
         <tr>  
          <td>firstName</td> 
          <td><form:input path="firstName"  /></td>
         </tr>  
                  <tr>  
          <td>lastName</td> 
          <td><form:input path="lastName"  /></td>
         </tr>  
                  <tr>  
          <td>emailAddress</td> 
          <td><form:input path="emailAddress"  /></td>
         </tr>  
                  <tr>  
          <td>password</td> 
          <td><form:input path="password"  type="password"/></td>
         </tr>  
<tr>  
          <td></td> 
          <td><form:input type="submit" value="save" path=""/></td>
         </tr>  
</table>  

</form:form>
</div>
</body>
</html>