<%-- 
    Document   : register_2
    Created on : 15-Feb-2021, 11:59:36 am
    Author     : Lenovo
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%// if(session.getAttribute("username")== null){
     //response.sendRedirect("Login.jsp");
   
   //  }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Success Page</title>
</head>
<body bgcolor="orange">
         <style>.left-col{width: 150px; text-align:left; } .right-col{float: right; }</style>
<form action="vad2"  method="post" > 
<table align="left"  border="0" width="80%"  height="20%" color="lightgreen">
<input type="hidden" id="id" name="id" value="27"> 
<input type="hidden" id="id" name="request" value="update"> 
<input type="hidden" id="id" name="issue_status" value="issue_status"> 
<input type="hidden" id="id" name="assigned_user_id" value="187"> 
<tr class=left-col><td></td><td><input class=right-col align="right"  type="submit" value="Save " /></td><td></td><tr>
<tr class=left-col><td>Project No.</td><td>27</td><tr>
<tr class=left-col><td>assigned_user_id Unique</td><td>187</td><tr>
<tr class=left-col><td>Project issue_status</td><td>issue_status</td><tr>
<tr class=left-col><td>issue_title  Name</td><td><input type="text" name="issue_title" style="min-width: 950px ; max-width:950px; maxlength:102px;" value="502 Engineering Vacancies in Forest Department"/></td><tr>
<tr class=left-col><td>platform  Name</td><td><input type="text" name="platform" style="min-width: 950px ; max-width:950px; maxlength:102px;" value="we"/></td><tr>
<tr class=left-col><td>platform_version  Name</td><td><input type="text" name="platform_version" style="min-width: 950px ; max-width:950px; maxlength:102px;" value="ew"/></td><tr>
<tr class=left-col><td>browser  Name</td><td><input type="text" name="browser" style="min-width: 950px ; max-width:950px; maxlength:102px;" value="we"/></td><tr>
<tr class=left-col><td>browser_version  Name</td><td><input type="text" name="browser_version" style="min-width: 950px ; max-width:950px; maxlength:102px;" value="21"/></td><tr>
<tr class=left-col><td>issue issue_description!</td><td><textarea name="issue_description" maxlength="1024" style="min-width: 950px ; max-width:950px; min-height: 350px; max-height: 350px;"/>502 <br>Engineering Vacancies in Forest Department <br> The Selection will be based on Preliminary Written Exam, Main Exam (Descriptive Type) , Physical Test & Interview.
Note: Interested candidates may apply Online through the website http://www.ukpsc.gov.in form 11.08.2021 to 31.08.2021. (Extended up to 08.10.2021)</textarea></td><tr>
<tr class=left-col><td>attached_file  Name</td><td><input type="file" name="attached_file" style="min-width: 950px ; max-width:950px; maxlength:102px;" value=""/></td><tr>
</table> </form>
<h1><br>-----------------------------------------------------------------</h1><br>
 
</body>
</html>
