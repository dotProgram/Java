<%-- 
    Document   : addProject
    Created on : 05-Mar-2021, 1:40:20 pm
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% session=request.getSession();  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Project</title>
          <!-- PLUGINS CSS STYLE -->
  <link rel="stylesheet" href="../plugins/bootstrap/bootstrap.min.css">
  <link rel="stylesheet" href="../plugins/themify-icons/themify-icons.css">
  <link rel="stylesheet" href="../plugins/slick/slick.css">
  <link rel="stylesheet" href="../plugins/slick/slick-theme.css">
  <link rel="stylesheet" href="../plugins/fancybox/jquery.fancybox.min.css">
  <link rel="stylesheet" href="../plugins/aos/aos.css">

    </head>
    <body>
        <h1>Add Project Page</h1>
        <div align="center" style='margin-top: 15%; background-color: white;'">
<h1 align="center" > Project Details</h1>
<form action="../projects/projectAdd" method="post" >
			<table style="with: 50%">
			<tr>
					<td></td><td>
                                            <% try{
                                            
                                           
                                           if(session.getAttribute("role") == null){
                                           RequestDispatcher req = request.getRequestDispatcher("Login.jsp");
                                           response.sendRedirect("../Login.jsp");
                                           
                                           }
    if(request.getAttribute("invalid")!= null && request.getAttribute("invalid").toString().equals("inval")){
       out.println("<span style='color:red;'>");
        out.println("Empty Username or Password");
        out.println("</span>");
    }
    
        else if(  request.getAttribute("auth") != null && request.getAttribute("auth").toString().equals("invalid")){
       out.println("<span style='color:red;'>");
        out.println("Invalid Username or Password");
        out.println("</span>");
     }
                                        }
finally{}
%>
                                        </td>
                                        
					
				</tr>	
                            <tr>
					<td>Project Name</td>
					<td><input type="text" name="project_name" /></td>
				</tr>
				<tr>
					<td>Project Description</td>
					<td><input type="text" name="project_description" /></td>
				</tr>
				
				</tr></table>
			<input type="submit" value="Submit" /></form>
			</div>
    </body>
</html>
