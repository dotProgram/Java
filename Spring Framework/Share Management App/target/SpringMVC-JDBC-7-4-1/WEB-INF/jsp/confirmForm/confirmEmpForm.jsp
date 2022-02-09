<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ include file="../global/theme/header.jsp" %> 
<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg); text-align:center">
		<h1>Employee - Confirm Form</h1>
       	<table class="table" > 
       <form:form method="POST" action="save"  align="center" >  
    <%--      <form:form method="POST" action="save"  align="center" modelAttribute="confirmSaveModel">  --%>   
        
   
    <tr>
      	<td></td>  
             
                 <td><form:hidden  path="name" /></td>
                  <td><form:hidden  path="salary" /></td>
                   <td><form:hidden  path="designation" /></td>

         </tr> 
         <tr>  
          <td>Name : </td> 
         <td>${name}</td>
         </tr>  
         <tr>  
          <td>Salary :</td>  
        <td>${salary}</td>
         </tr> 
         <tr>  
          <td>Designation :</td>  
          <td>${designation}</td>
         </tr> 
         
          <tr>  
          <td> <form:checkbox path="" value="element"/>  I confirm to save details as above </td>  
          <td><input type="submit" class="btn btn-success"  value="Confirm & Save" /> 
          </form:form> 
          </td>

<tr>  
			 <form:form method="POST" action="editemp"  align="center" > 
          <td><form:hidden  path="id" /> <form:hidden  path="name" /> <form:hidden  path="salary" /> <form:hidden  path="designation" /> </td>  
          
          <td><input type="submit" class="btn btn-primary"  value="Edit" /></td>
    
        
     </form:form> 
    </tr> 
      </table> 
      
 <%@ include file="../global/theme/footer.jsp" %>   
