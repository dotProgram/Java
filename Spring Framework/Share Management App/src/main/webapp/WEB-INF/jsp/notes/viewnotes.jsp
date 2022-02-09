    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
     <%@ include file="../global/theme/header.jsp" %> 
<body style="background-image:url(${pageContext.request.contextPath}/images/Spring-Framework-min.jpg); text-align:center; ">
	<div class="container">  
	<h1>Equity Wish List</h1>
	<table border="2" width="70%" cellpadding="2" style="margin-left:auto;margin-right:auto;">
        <tr><th>Id</th>
            <th>Equity Name</th>
            <th>Equity Rate</th>
            <th>Comments</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        
        <c:forEach var="forEachTraverser" items="${list}"> 
                <tr>
                <td>${forEachTraverser.id}</td>
                <td>${forEachTraverser.name}</td>
                <td>${forEachTraverser.subject}</td>
                <td>${forEachTraverser.description}</td>
                <td><a href="editemp/${forEachTraverser.id}">Edit</a></td>
                <td><a href="deleteemp/${forEachTraverser.id}">Delete</a></td>
                </tr>
        </c:forEach>
    </table>
    <br/>
    </div> 
    <a href="empform">Add New Notes</a>
     <%@ include file="../global/theme/footer.jsp" %> 