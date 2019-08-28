<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Login Page</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

<link href="./jsp/ipoplanned.css" rel="stylesheet">
</head>
<body>
<% 
Object username=session.getAttribute("admin");
if(username==null){
	 response.sendRedirect("/loadLogin");
}
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);
 %> 
<div class="container-fluid nav-container">
<div class="row">
 <div class="col-md-2">
  <img src="logo.jpg">
 </div>
  <div class="col-md-8">
  <ul class="nav nav-pills nav-justified">
       <li class="dropdown active"><a class="dropdown-toggle"
      data-toggle="dropdown" href="#">Import Data <span class="caret"></span></a>
        <li class="dropdown"><a class="dropdown-toggle"
      data-toggle="dropdown" href="#">Manage Company <span class="caret"></span></a>
      <ul class="dropdown-menu">
       <li><a href="/loadCompany">Add Company</a></li>
       <li><a href="/manageCompany">Edit Company</a></li>
       <li><a href="/listCompany">List Company</a></li>
      </ul></li>
      <li class="dropdown"><a class="dropdown-toggle"
      data-toggle="dropdown" href="#">Manage Exchange <span class="caret"></span></a>
      <ul class="dropdown-menu">
       <li><a href="/loadStock">Add Stock Exchange</a></li>
       <li><a href="/listStock">List Stock Exchange</a></li>
      
      </ul></li>
      <li class="dropdown " ><a class="dropdown-toggle"
      data-toggle="dropdown" href="#">Manage Ipo <span class="caret"></span></a>
      <ul class="dropdown-menu">
       <li><a href="/loadIpo">Add Ipo</a></li>
       <li><a href="/listIpo">List Ipo</a></li>
      
      </ul></li>
   </ul>
 </div>
<div class="col-md-2">
<a class="btn btn-danger" button type="submit" class="btn btn-danger btn-md logout"  href ="<c:url value = "/logout" />">Logout</a>
 </div>
</div>
</div>
  <div class="container">
       <div class="card card-container">
          <header>
           <div class="login-head">
              <h1 class="login-head-content"><i class="fa fa-server"></i> Import Data </h1>
           </div>
           </header>
                  <form:form class="form-signin" action="/importData" method="POST" modelAttribute="importData" enctype="multipart/form-data">
            
               
   <div class="form-group">
    <label class="control-label col-sm-6" for="excelfile">
     Select the Excel file to be uploaded:</label>
    
    <div class="file-field medium col-sm-6">
     <!-- <div class="btn btn-rounded aqua-gradient float-left"> -->
      <input type="file"
       accept=".xlsx,.xls" name="file">
     <!-- </div> -->
     <!-- <div class="file-path-wrapper">
      <input class="file-path validate" type="text"
      placeholder="Upload your file">
     </div> -->
    </div>
    <br>
    <br>
    <br>
   <br>
   <br>
   <br>
   <div class="form-group">
    <div class="col-sm-offset-2 col-sm-12">
       <button class="btn btn-lg btn-primary btn-block btn-signin" style="width:50%" type="submit">Submit</button>

    </div>
   </div>

  </form:form>
</div>

 
</body>
</html>