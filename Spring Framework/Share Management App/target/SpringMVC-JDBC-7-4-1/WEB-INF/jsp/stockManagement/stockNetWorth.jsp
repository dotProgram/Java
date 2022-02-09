<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ include file="../global/theme/header.jsp" %> 
<style>
  #result{
background-color: #99d295;/* */
 height: 180px;
  width: 180px;
 text-align: center;
  border-radius: 50%;
padding-top: 60px;
border-width: 1px;
border-color: lightgray;
  }
td{

  font-size: 20px;
}

</style>
<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg); text-align:left">
                <div class="container">
  <h1>Equity Net Worth </h1>
                                <br>background-color: #fdb4b4;  <br>  
<br> <br> 
                 <table class="table" style="background-color: #f9fff5; font-family:fangsong;">

         <tr>
        <td></td>  
        <td></td>  
        <td>  </td> 
            <td><button type="button" class="btn btn-default">
          <span class="glyphicon glyphicon-print"></span> Print
        </button>
        </tr>         
           <tr>
        <td> <h3>Equity Net Worth in Rupees</h3></td> 
        <td></td>   
        <td><div id="result"> <h3><span class="${IconBootstrapForPoL}"></span>&nbsp;<b>&#8377; ${stockResult}</b></h3></div></td> 
        </tr>  
         
                   <tr>
        <td style="text-align:center;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h3><b>Analysis<b></h3></td>  
        <td></td>  
        <td>  </td> 
            <td>  </td> 
        </tr>  
           <tr>
      	<td> Total Number Of Stocks for <a><b>${StockNameTitle}</b></a></td>  <td></td>  
        <td> ${NumberOfStocks}</td> 
        </tr>    
        <tr>
      	<td> Equity Rate At The Time Of Purchase </td>  <td></td>  
        <td> &#8377;&nbsp;${StockPriceAtTheTimeOfPurchase}</td> 
        </tr> 
        <tr>
      	<td> Total Equity Investment At The Time Of Purchase</td>  <td></td>  
        <td> &#8377; ${TotalInvestmentInStockAtTheTimeOfPurchase}<br>${totalInvestmentInStockAtTheTimeOfPurchaseToWords} Rupees Only</td> 
        </tr>
                <tr>
      	<td> Total Investment for the Equity <a><b>${StockNameTitle}</b></a> <br>for Shares <u>${NumberOfStocks}</u> as Investment </td>  <td></td>  
        <td>&nbsp;&nbsp;&nbsp;&#8377;  ${StockPriceAtTheTimeOfPurchase} x  ${NumberOfStocks} <br>= &#8377;&nbsp;${TotalInvestmentInStockAtTheTimeOfPurchase}</h4></td> 
        </tr> 
                         
        <tr>
      	<td> Equity Value for ${NumberOfStocks} Shares @${CurrentStockPrice}/Share for Present </td>  <td></td>  
        <td>&nbsp;&nbsp;&nbsp;&#8377;  ${CurrentStockPrice} x  ${NumberOfStocks} <br>= &#8377;&nbsp;${CurrentStockPriceForAll} <br>${totalInvestmentInStockAtPresentToWords} Rupees Only</h4></td> 
        </tr> 
      	<td> Equity Rate At Present ${CurrentStockPrice} </td>  <td></td>  
        <td>&#8377; ${CurrentStockPrice}</h4></td> 
        </tr>
                                <tr>
        <td>Net Equity Value At Present </td> 
        <td></td>   
        <td>&#8377; ${CurrentStockPrice}</td> 
        </tr> 
        
         <tr>
        <td> <b>Equity Net Gain/Loss in Rupees</b></td> 
        <td></td>   
        <td><div> <b>&#8377; ${stockResult}</b><br>${amountToWords} Rupees Only</div></td> 
        </tr>        
         </table> 




             <%--       
             <table class="table" style="background-color:white;">  --%>
     <%--   <form:form method="POST" action="../../calculate"  align="center" >  --%> 
 <%--
         <form:form method="POST" action="../../calculate"  align="center" modelAttribute="command">    
        
   
    <tr>
      	<td></td>  
         
                 <td><form:hidden  path="" /></td>
                  <td><form:hidden  path="" /></td>--%><%--
                   <td><form:hidden  path="numberOfStocks" /></td>
                   <td><form:hidden  path="currentStockPrice" /></td>
                   <td><form:hidden  path="stockPriceAtTheTimeOfPurchase" /></td>

         </tr> 
         <tr>  
          <td>Equity Id : </td> 
         <td>${command.id}</td>
         </tr>  
         <tr>  
          <td>stockName Title :</td>  
        <td>${command.stockNameListed}</td>
         </tr> 
         <tr>  
          <td>Equity stocknameTitle :</td>  
          <td>${command.stockNameTitle}</td>
         </tr> 
                  <tr>  
          <td>Equity Price AtTheTimeOfPurchase :</td>  
          <td>${command.stockPriceAtTheTimeOfPurchase}</td>
         </tr> 
                  <tr>  
          <td>Equity Date OfPurchase :</td>  
          <td>${command.stockDateOfPurchase}</td>
         </tr> 
                  <tr>  
          <td>current Equity Price :</td>  
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
          <td> <form:checkbox path="" value=""/>  I confirm to save details as above </td>  
          <td><input type="submit" class="btn btn-success"  value="Calculate" /> 
          </form:form> 
          </td>

<tr>  
			 <form:form method="POST" action="editemp"  align="center" > 
          <td><form:hidden  path="" /> <form:hidden  path="" /> <form:hidden  path="" /> <form:hidden  path="" /> </td>  
          
          <td><input type="submit" class="btn btn-primary"  value="Edit" /></td>
    
        
     </form:form> 

    </tr> 
      </table> 

   --%>  
     </div>  
 <%@ include file="../global/theme/footer.jsp" %>   
