<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ include file="../global/theme/header.jsp" %> 
<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg); text-align:center">
    <div class="container">             
        <h1>Equity Stock Details</h1><br>
                
         	<table class="table" style="background-color:white;"> 
                      
                

</table>       
       	<table class="table" style="background-color:white;"> 
        <tr> 
          
                                <td></td> 
                                <td></td>
                                <td>
                                        <form:form method="POST" action="../../editStock/${command.id}"  align="center" > 
                                        <form:hidden  path="" /> 
                                        <form:hidden  path="" /> <form:hidden  path="" /> 
                                        <form:hidden  path="" />   
                                        
        <button type="submit" class="btn btn-default">
          <span class="glyphicon glyphicon-pencil"></span> Edit 
        </button>
                                       
                                        </form:form> 
                                </td>
                        </tr>   
       
        <tr>  
     
         <form:form method="POST" action="../../evaluate"  align="center" modelAttribute="command">       
        </tr>   
   
    <tr>
      	<td></td>  
             <%--  
                   <td><form:hidden  path="" /></td>
                   <td><form:hidden  path="" /></td>--%>
                   <td><form:hidden  path="numberOfStocks" /></td>
                   <td><form:hidden  path="currentStockPrice" /></td>
                   <td><form:hidden  path="stockPriceAtTheTimeOfPurchase" /></td>
                   <td><form:hidden  path="stockNameTitle" /></td>


         </tr> 
         <tr>  
          <td>stock Id : </td> 
         <td>${command.id}</td>
         </tr>  
         <tr>  
          <td>stockName Title :</td>  
        <td>${command.stockNameListed}</td>
         </tr> 
         <tr>  
          <td>stock stocknameTitle :</td>  
          <td>${command.stockNameTitle}</td>
         </tr> 
                  <tr>  
          <td>stock Price AtTheTimeOfPurchase :</td>  
          <td>${command.stockPriceAtTheTimeOfPurchase}</td>
         </tr> 
                  <tr>  
          <td>stock Date OfPurchase :</td>  
          <td>${command.stockDateOfPurchase}</td>
         </tr> 
                  <tr>  
          <td>current Stock Price :</td>  
          <td>${command.currentStockPrice}</td>
         </tr> 
                  <tr>  
          <td>number Of Stocks :</td>  
          <td>${command.numberOfStocks}</td>
         </tr> 
                  <tr>  
          <td>stockSector :</td>  
          <td>${command.stockSector}</td>
         </tr> 
                              <tr>  
          <td>stockDiscription :</td>  
          <td>${command.stockDiscription}</td>
         </tr>   
                                     <tr>  
        <td>Personal Note :</td>  
          <td>${command.stockDiscription}</td>
         </tr>
        <td>Equity Sell Date :</td>  
          <td>${command.stockDateOfPurchase}</td>
         </tr>

          <tr>  
          <td> <form:checkbox path="" value=""/>  I confirm to save details as above </td>  
          <td><input type="submit" class="btn btn-success"  value="Evaluate" /> 
          </form:form> 
          </td>

<tr>  
			 <form:form method="POST" action="../../editStock/${command.id}"  align="center" > 
          <td><form:hidden  path="" /> <form:hidden  path="" /> <form:hidden  path="" /> <form:hidden  path="" /> </td>  
          
          <td><input type="submit" class="btn btn-primary"  value="Edit" /></td>
    
        
     </form:form> 
    </tr> 
      </table> 
      </div>     
 <%@ include file="../global/theme/footer.jsp" %>   
