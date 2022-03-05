    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <%@ include file="../global/theme/header.jsp" %> 
<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg); text-align:center">
   <div class="container">  
    <br/>
<!-- 
    <div class="alert alert-success" role="alert">
  This is a success alert—check it out!
</div>

<div  class="alert alert-success alert-dismissible fade show">
${messae}
</div> 
  
<div class="alert alert-success">
  <strong>Success!</strong> Indicates a successful or positive action.
</div>
 -->   

<div class="alert alert-success alert-dismissible">
  <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
  <strong>${messae}</strong>  
</div>

<!-- 
    <div>

             ${html}
    </div> 
 -->   
    <br/>

    <br/>

    <h1>Employees List - Confirm Form</h1>
	<table id="sampleTableA" class="table table-striped position-center" border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Edit</th><th>Delete</th></tr>
    <c:forEach var="emp" items="${list}"> 
    <tr>
    <td>${emp.id}</td>
    <td>${emp.name}</td>
    <td>${emp.salary}</td>
    <td>${emp.designation}</td>
    <td><a class="btn btn-warning" href="editemp&${emp.id}">Edit</a></td>
    <td><a class="btn btn-info" href="deleteemp/${emp.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>

    <br/>
    <a class="btn btn-primary" href="newEmpForm">Add New Employee</a>

    <br/>

    <br/>
    </div>  
     <%@ include file="../global/theme/footer.jsp" %>   