<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">   
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="${pageContext.request.contextPath}/resources/bootstrap/js/jbootstrap.min.js"></script>
      <script src="${pageContext.request.contextPath}/resources/bootstrap/js/jquery-3.6.0.min.js"></script>
      <!-- Replaced 
<link href="https://www.tutorialspoint.com/bootstrap/css/bootstrap.min.css" rel="stylesheet">
      <script src="https://www.tutorialspoint.com/bootstrap/scripts/jquery.min.js"></script>
      <script src="https://www.tutorialspoint.com/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
-->


</head>
    <style>

        html, body {
    min-height: 100%;
    min-width: 100%;

}
.header {

  left: 0;
  bottom: 0;
  width: 100%;
margin-top: -30px;
  background-color: #222421;
min-height: 120px;
  /*text-align: center;*/ 
}
#sampleTableA {

border-radius: 15px;
}
#logo {
     margin-top: 20px;
}

#navbarSupportedContent {
     margin-top: 60px;
     margin-right: 20px;
       position:absolute;
     top:0;
     right:0;

  /**/ 
}

</style>
<header class="header">
<!-- NAVBAR-->
    <!-- NAVBAR
     <img src="https://w7.pngwing.com/pngs/846/310/png-transparent-bull-market-rise-golden-bull-arrow-thumbnail.png" width="55" alt="" class="d-inline-block align-middle mr-2">
    
    
    -->
<nav class="navbar navbar-expand-lg py-3 navbar-dark bg-dark shadow-sm">

  <div class="container" id="logo">
    <a href="${pageContext.request.contextPath}/" class="navbar-brand">
      <img src="${pageContext.request.contextPath}/resources/images/pngwing.com.png" width="85" alt="" class="d-inline-block align-middle mr-2">
     
      <!-- Logo Image 
      <img src="https://bootstrapious.com/i/snippets/sn-nav-logo/logo.png" width="45" alt="" class="d-inline-block align-middle mr-2">
     -->
      <!-- Logo Text -->
     
    </a>
     <span class="text font-weight-bold">EQUITY ARCHIVE</span>
<!-- NAVBAR-
    <button type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation" class="navbar-toggler"><span class="navbar-toggler-icon">
     <span>   </span>
</button>
-->
  </div>
    <div id="navbarSupportedContent" class="collapse navbar-collapse">
      <ul class="navbar-nav">
    <!-- FOR DEMO PURPOSE    <li class="nav-item active"><a href="#" class="nav-link">Home <span class="sr-only">(current)</span></a></li>-->
        <li class="nav-item active"><a href="${pageContext.request.contextPath}" class="nav-link">Home </a></li>
        <li class="nav-item"><a href="#" class="nav-link">About</a></li>
        <li class="nav-item"><a href="#" class="nav-link">Services</a></li>
        <li class="nav-item"><a href="#" class="nav-link">Contact</a></li>
      </ul>
    </div>


</nav>
</header> 
<!-- FOR DEMO PURPOSE
<section class="py-5">
  <div class="container py-5">
    <ol class="pl-3">
      <li class="mb-3">Add your logo image inside<code>a.navbar-brand</code></li>
      <li class="mb-3">You can set the logo width and height by<code>width=""</code>,<code>height=""</code> attributes.</li>
      <li class="mb-3">Add one of <code>.align-top .align-middle .align-bottom</code> classes to vertically adapt adjacent text with the image.</li>
    </ol>
    
    <p class="text-muted mt-5">Snippet by <a href="https://bootstrapious.com/snippets" class="text-reset">
            <u>Bootstrapious</u></a>
        </p>
</p>
    
  </div>
</section>
-->

<!--
<header class="header">
<h3><a class="btn btn-info" href="${pageContext.request.contextPath}">Home</a></h3>

<h1>Thine Equity Share Management</h1>

</header> 

-->