<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ include file="../global/theme/header.jsp" %> 
<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg); text-align:center">
		<h1>Employee - New Form</h1>
       <form:form method="post" action="confirmSave"  align="center">
        <%--    
        <form:form method="post" action="confirmSave"  align="center" modelAttribute="newEmpFormModel">
        <form:form method="post" action="confirmSave"  align="center">  
             <form:form method="post" action="confirmSave"  align="center" modelAttribute="confirmSaveModel">
  
             --%> 
      	<table class="table" >  
         <tr>  
          <td>Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="salary" /></td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td><form:input path="designation" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" class="btn btn-success"  value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
 <%@ include file="../global/theme/footer.jsp" %>   