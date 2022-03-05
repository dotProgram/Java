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

<!--  --> 
    <style>

      #sampleTableA{border-collapse: collapse;
    margin: 25px 0;
    
    font-size: 0.9em;
    font-family: sans-serif;
    min-width: 400px;
    background-color: #fff; 
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
    }
      #sampleTableR{
  background-color: #009879;
    color: #ffffff;
    text-align: left;
    }

.table tbody tr {
    border-bottom: 1px solid #dddddd;
   /* transition: color 3s;*/
   transition: 3s;
   width:20px;
   height:35px;
}


.table tbody tr :hover {
    
    
    transition: 2.5s;
    cursor:pointer;
    background-color: #c2ede4;
  /*   color: #009879;
  font-weight: bold;
    width:initial;
    height:initial;
   transition-delay: 2s;
     transition: 200s, height 400s;*/
}   

.table tbody tr:nth-of-type(even) {
    background-color: #f3f3f3;

}

.table tbody tr:nth-of-type(even):hover {
   background-color: #c2ede4;

}

.table tr:first-of-type(1):hover {
    border-radius: 15px;
    background-color: steelblue;
   /* transition: color 3s;*/
}

.table tbody tr:nth-of-type(odd):hover {
   background-color: #c2ede4;

}



.table tbody tr:last-of-type {
    border-bottom: 2px solid #009879;
}
.table tbody tr.active-row {
    font-weight: bold;
    color: #009879;
}
   

   
    </style> 
  
    <br/>

    <br/>

    <h1>viewStocks List - Confirm Form</h1>
    <div style="overflow:scroll; margin-left: 11.5%;top:0;right:0;width:88%; min-height:600px;max-height:fit-content; border-radius: 15px;">
	<table  id="sampleTableA" class="table" border="2" width="70%" cellpadding="2">
    <tr id="sampleTableR">
         <th>Select</th> 
                <th>Id</th><th>stockNameListed</th><th>stockNameTitle</th><th>stockDiscription</th><th>stockSector</th><th>stockPriceAtTheTimeOfPurchase</th>
                <th>stockDateOfPurchase</th><th>currentStockPrice</th><th>numberOfStocks</th><th>idOfStockHolder</th>
                <th>Modify</th><th>Delete</th>
    </tr>
       
    <c:forEach var="stock" items="${list}"> 
    <tr>
   <td>
       <input type="checkbox" id="vehicle1" name="vehicle1" value="Bike">
      <%--  <form:checkboxes  items="0,1"/> </td>
     <td><form:checkboxes path="" items="${stock.id}"/> </td>  
     <input type="checkbox" id="vehicle1" name="vehicle1" value="Bike">--%>
    <td>${stock.id}</td>
    <td>${stock.stockNameListed}</td>
    <td>${stock.stockNameTitle}</td>
    <td>${stock.stockDiscription}</td>
    <td>${stock.stockSector}</td>
    <td>${stock.stockPriceAtTheTimeOfPurchase}</td>
    <td>${stock.stockDateOfPurchase}</td>
    <td>${stock.currentStockPrice}</td>
     <td>${stock.numberOfStocks}</td>
    <td>${stock.idOfStockHolder}</td>
    <td><a class="btn btn-warning" href="editemp&${emp.id}">Modify</a></td>
    <td><a class="btn btn-info" href="deleteemp/${emp.id}">Delete</a></td>
    </tr>
    </c:forEach>

    </table>
</div>
    <br/>

    <br/>
    <a class="btn btn-primary" href="newEmpForm">Add New Equity</a>

    <br/>

    <br/>
    </div> 
     <%@ include file="../global/theme/footer.jsp" %>   