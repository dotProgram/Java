    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <%@ include file="../global/theme/header.jsp" %> 
<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg); text-align:center">

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
 <br/>
   s1 - ${s1}
    <br/>
 <br/>
    session_value - ${session_value}
    <br/>
    Ip Address - ${getRemoteHost}
    <br/>

    <h1>Equity - Shares Ownership List</h1>
    <div style="overflow:scroll; margin-left: 11.5%;top:0;right:0;width:88%; min-height:600px;max-height:850px; border-radius: 15px;">
	<table style="cursor:pointer ;background-color:white;" id="sampleTableA" class="table" border="2" width="70%" cellpadding="2">
    <tr id="sampleTableR">
         <th>Select</th> 
                <th>Id</th><th>stockNameListed</th><th>stockNameTitle</th><%--<th>stockDiscription</th>--%><th>stockSector</th><th>stockPriceAtTheTimeOfPurchase</th>
                <th>stockDateOfPurchase</th><th>currentStockPrice</th><th>numberOfStocks</th><th>idOfStockHolder</th>
                <th>Modify</th><th>Delete</th>
    </tr>
       
    <c:forEach var="stock" items="${list}"> 
    <tr onclick="window.location='viewStock2/details/${stock.id}'">
   <td>
       <input type="checkbox" id="vehicle1" name="vehicle1" value="Bike">
      <%--  <form:checkboxes  items="0,1"/> </td>
     <td><form:checkboxes path="" items="${stock.id}"/> </td>  
     <input type="checkbox" id="vehicle1" name="vehicle1" value="Bike">--%>
    <td>${stock.id}</td>
    <td>${stock.stockNameListed}</td>
    <td>${stock.stockNameTitle}</td>
   <%--    <td>${stock.stockDiscription}</td>--%>
    <td>${stock.stockSector}</td>
    <td>${stock.stockPriceAtTheTimeOfPurchase}</td>
    <td>${stock.stockDateOfPurchase}</td>
    <td>${stock.currentStockPrice}</td>
     <td>${stock.numberOfStocks}</td>
    <td>${stock.idOfStockHolder}</td>
    <td><a class="btn btn-warning" href="viewStock2/details/${stock.id}">Details</a></td>
    <td><a class="btn btn-info" href="/details/2${emp.id}">Delete</a></td>
    </tr>
    </c:forEach>

    </table>
</div>
    <br/>

    <br/>
    <a class="btn btn-primary" href="addNewStock">Add New Equity</a>

    <br/>

    <br/>
   
     <%@ include file="../global/theme/footer.jsp" %>   