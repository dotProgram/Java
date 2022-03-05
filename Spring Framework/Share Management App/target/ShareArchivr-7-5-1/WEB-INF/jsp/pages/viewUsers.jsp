    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg); text-align:center">
 
<h1>Multiple View Resolver" /viewUsers</h1></br>
	<h1>Employees List</h1>
 
	<table border="2" width="70%" cellpadding="2"  >
	<tr><th>Id</th><th>role</th><th>firstN</th><th>lName</th><th>userid</th><th>email</th><th>phno</th></tr>
    <c:forEach var="var" items="${list}"> 
    <tr>
    <td>${var.id}</td>
    <td>${var.role}</td>
    <td>${var.firstN}</td>
    <td>${var.lName}</td>
    <td>${var.userid}</td>
    <td>${var.email}</td>
<td>${var.phno}</td>
    <td><a href="pages/Useredit/${var.id}">Edit</a></td>
    <td><a href="pages/deleteUser/${var.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="empform">Add New User</a>