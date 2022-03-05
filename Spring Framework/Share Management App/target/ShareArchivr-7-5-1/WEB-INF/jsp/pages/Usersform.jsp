<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg); text-align:center">
		<h1>Add New User</h1>
       <form:form method="post" action="save"  align="center">  
<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="id" /></td>
         </tr> 
         <tr>  
          <td>First Name : </td> 
          <td><form:input path="firstN"  /></td>
         </tr>  
         <tr>  
          <td>Last Name :</td>  
          <td><form:input path="lName" /></td>
         </tr> 
         <tr>  
          <td>User Id :</td>  
          <td><form:input path="userid" /></td>
         </tr> 
         <tr>  
          <td>Email : </td> 
          <td><form:input path="email"  /></td>
         </tr>
         <tr>  
          <td>Phone No. : </td> 
          <td><form:input path="phno"  /></td>
         </tr>
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form> 
