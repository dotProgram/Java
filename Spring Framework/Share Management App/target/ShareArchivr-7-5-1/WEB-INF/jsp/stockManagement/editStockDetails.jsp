<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ include file="../global/theme/header.jsp" %> 



<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg); text-align:center">
		<h1>Edit Equity Details</h1>
                <div class="form-group" style="background-color: white;">
       <form:form method="POST" action="../update"  align="center">  
      	<table class="table" class="table" >  
      	<tr>
      	<td></td>  
                <!--  --><td><form:hidden  path="Id" /></td>
        <!--         <td><form:hidden  path="stockNameTitle" /></td>
                  <td><form:hidden  path="stockDiscription" /></td>
                   <td><form:hidden  path="stockSector" /></td>
-->     <td><span class="glyphicon glyphicon-print"></span></td> 
         </tr> 
  
         <tr>  
          <td><label for="" class="col-form-label-lg">Stock Name Listed on Exchange: </label></td> 
          <td><form:input path="stockNameListed" class="form-control" /></td>
         </tr>  
         <tr>  
          <td><label for="" class="col-form-label-lg">Stock Title :</label></td>  
          <td><form:input path="stockNameTitle" class="form-control"/></td>
         </tr> 
         <tr>  
          <td><label for="" class="col-form-label-lg">Stock Discription :</label></td>  
          <td><form:textarea path="stockDiscription" class="form-control"/></td>
         </tr> 
                  <tr>  
          <td><label for="" class="col-form-label-lg">Stock Sector : </label></td> 
          <td><form:input path="stockSector"  class="form-control"/></td>
         </tr>  
         <tr>  
          <td><label for="" class="col-form-label-lg">Stock Purchase Rate:</label></td>  
          <td><form:input path="stockPriceAtTheTimeOfPurchase" class="form-control"/></td>
         </tr> 
         <tr>  
          <td><label for="" class="col-form-label-lg">Stock Date Of Purchase :</label></td>  
          <td><form:input type="date" path="stockDateOfPurchase" class="form-control"/></td>
         </tr> 
                  <tr>  
          <td><label for="" class="col-form-label-lg">Current Stock Price :</label></td>  
          <td><form:input path="currentStockPrice" class="form-control"/></td>
         </tr> 
         <tr>  
          <td><label for="" class="col-form-label-lg">Total Number Of Stock Owenerships:</label></td>  
          <td><form:input path="numberOfStocks" class="form-control" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td>
                  <button type="submit" class="btn btn-default">
          <span class="glyphicon glyphicon-floppy-disk"></span> Save
        </button>
              <!--    <input type="submit" class="btn btn-success"  value="Save" /></td>   --> 
         </tr>  
        </table>  
       </form:form>  
       </div>
 <%@ include file="../global/theme/footer.jsp" %>   