<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ include file="../global/theme/header.jsp" %> 
<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg); text-align:center">
     <div class="container">               
        <h1>New Stock Form</h1>
       <form:form method="POST" action="save"  align="center">  
      	<table class="table" class="table" >  
      	<tr>
      	<td></td>  
        <%--         <td><form:hidden  path="Id" /></td>                --%>
        <%--         <td><form:hidden  path="stockNameTitle" /></td>
                     <td><form:hidden  path="stockDiscription" /></td>
                     <td><form:hidden  path="stockSector" /></td>
        --%>  
        <td><span class="glyphicon glyphicon-print"></span></td> 
         </tr> 
  
         <tr>  
          <td>Stock Name Listed on Exchange: </td> 
          <td><form:input path="stockNameListed"  /></td>
         </tr>  
         <tr>  
          <td>Stock Title :</td>  
          <td><form:input path="stockNameTitle" /></td>
         </tr> 
         <tr>  
          <td>Stock Discription :</td>  
          <td><form:textarea path="stockDiscription" /></td>
         </tr> 
                  <tr>  
          <td>Stock Sector : </td> 
          <td><form:input path="stockSector"  /></td>
         </tr>  
         <tr>  
          <td>Stock Purchase Rate:</td>  
          <td><form:input path="stockPriceAtTheTimeOfPurchase" /></td>
         </tr> 
         <tr>  
          <td>Stock Date Of Purchase :</td>  
          <td><form:input type="date" path="stockDateOfPurchase" /></td>
         </tr> 
                  <tr>  
          <td>Current Stock Price :</td>  
          <td><form:input path="currentStockPrice" /></td>
         </tr> 
         <tr>  
          <td>Total Number Of Stock Owenerships:</td>  
          <td><form:input path="numberOfStocks" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" class="btn btn-success"  value="Save" /></td>  
         </tr>  
        </table>  
       </form:form> 
  </div>   
 <%@ include file="../global/theme/footer.jsp" %>   