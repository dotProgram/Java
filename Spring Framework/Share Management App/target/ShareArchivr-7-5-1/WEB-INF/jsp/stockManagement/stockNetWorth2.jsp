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


}
  #head-span{
align-items: center; 
display: flex; 
justify-content: center;
  margin: auto;
text-align: center;
      vertical-align: middle;
      padding-top: 55px;
  }
</style>
<body style="background-image:url(${_stockDetailsBean.pageContext.request.contextPath}/images/Spring-Framework-min.jpg); text-align:left">
<div class="container">
  <h1>Equity Net Worth </h1>
 <br> <br>  
<br> <br> 
                 <table class="table" style="background-color: #f9fff5">

         <tr>
        <td></td>  
        <td></td>  
        <td>  </td> 
            <td><button onclick = "window.print()" type="button" class="btn btn-default">
          <span class="glyphicon glyphicon-print"></span> Print
        </button>
        </tr>         
           <tr>
        <td> <h2>Equity Net Worth in /Rupees</h2></td> 
        <td></td>   
        <td><div id="result"> <h3><span class="${IconBootstrapForPoL}"></span>&nbsp;<b>&#8377; ${_stockDetailsBean.stockResult}</b></h3></div></td> 
        </tr>  
         
                   <tr>
        <td style="text-align:center;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h3><b>Analysis<b></h3></td>  
        <td></td>  
        <td>  </td> 
            <td>  </td> 
        </tr>  
           <tr>
      	<td> Total Number Of Stocks for ${_stockDetailsBean.stockNameTitle}</td>  <td></td>  
        <td> ${_stockDetailsBean.NumberOfStocks}</td> 
        </tr>    
        <tr>
      	<td> Equity Rate At The Time Of Purchase </td>  <td></td>  
        <td> &#8377;&nbsp;${_stockDetailsBean.stockPriceAtTheTimeOfPurchase}</td> 
        </tr> 
        
                <tr>
      	<td> Total Investment for the Equity ${_stockDetailsBean.stockNameListed} for Total purchased Shares <u>${_stockDetailsBean.NumberOfStocks}</u> At The Time Of Share Investment </td>  <td></td>  
        <td>&nbsp;&nbsp;&nbsp;&#8377;  ${_stockDetailsBean.stockPriceAtTheTimeOfPurchase} x  ${_stockDetailsBean.NumberOfStocks} <br>= &#8377;&nbsp;${_stockDetailsBean.TotalInvestmentInStockAtTheTimeOfPurchase}</h4></td> 
        </tr> 
                        <tr>
      	<td> Net Equity Value At The Time Of Purchase</td>  <td></td>  
        <td> &#8377; ${_stockDetailsBean.stockPriceAtTheTimeOfPurchase}</td> 
        </tr> 
        <tr>
      	<td> Equity Value for ${_stockDetailsBean.NumberOfStocks} At Present </td>  <td></td>  
        <td>&nbsp;&nbsp;&nbsp;&#8377;  ${_stockDetailsBean.currentStockPrice} x  ${_stockDetailsBean.numberOfStocks} <br>= &#8377;&nbsp;${_stockDetailsBean.currentStockPriceForAll}</h4></td> 
        </tr> 
      	<td> Equity Rate At Present ${_stockDetailsBean.currentStockPrice} </td>  <td></td>  
        <td>&#8377; ${_stockDetailsBean.currentStockPrice}</h4></td> 
        </tr>
                                <tr>
        <td>Net Equity Value At Present </td> 
        <td></td>   
        <td>&#8377; ${_stockDetailsBean.currentStockPrice}</td> 
        </tr> 
        
         <tr>
        <td> <b>Equity Net Worth in Rupees</b></td> 
        <td></td>   
        <td><div> <b>&#8377; ${_stockDetailsBean.stockResult}</b></div></td> 
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
         <td>${_stockDetailsBean.command.id}</td>
         </tr>  
         <tr>  
          <td>stockName Title :</td>  
        <td>${_stockDetailsBean.command.stockNameListed}</td>
         </tr> 
         <tr>  
          <td>Equity stocknameTitle :</td>  
          <td>${_stockDetailsBean.command.stockNameTitle}</td>
         </tr> 
                  <tr>  
          <td>Equity Price AtTheTimeOfPurchase :</td>  
          <td>${_stockDetailsBean.command.stockPriceAtTheTimeOfPurchase}</td>
         </tr> 
                  <tr>  
          <td>Equity Date OfPurchase :</td>  
          <td>${_stockDetailsBean.command.stockDateOfPurchase}</td>
         </tr> 
                  <tr>  
          <td>current Equity Price :</td>  
          <td>${_stockDetailsBean.command.currentStockPrice}</td>
         </tr> 
                  <tr>  
          <td>number Of Stocks :</td>  
          <td>${_stockDetailsBean.command.numberOfStocks}</td>
         </tr> 
                  <tr>  
          <td>stockSector :</td>  
          <td>${_stockDetailsBean.command.stockSector}</td>
         </tr> 
                              <tr>  
          <td>stockDiscription :</td>  
          <td>${_stockDetailsBean.command.stockDiscription}</td>
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
  </div>
   --%>    
 <%@ include file="../global/theme/footer.jsp" %>   
