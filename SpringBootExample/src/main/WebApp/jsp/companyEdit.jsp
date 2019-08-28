<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.keshav.SpringBootExample.model.Company" %>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>Company Edit Page</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

<link href="${pageContext.request.contextPath}/jsp/ipoplanned.css" rel="stylesheet">
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
  <img src="logo.jpg"> </div>
  <div class="col-md-8">
  <ul class="nav nav-pills nav-justified">
       <li class="dropdown"><a class="dropdown-toggle"
      data-toggle="dropdown" href="#">Import Data <span class="caret"></span></a>
      <ul class="dropdown-menu">
       <li><a href="/loadImport">Add Import</a></li>
      </ul></li>
        <li class="dropdown  active "><a class="dropdown-toggle"
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
              <h1 class="login-head-content"><i class="fa fa-server"></i>  Add Company Details</h1>
           </div>
           </header>
            <form:form class="form-signin" method="POST" action="/updateCompany" modelAttribute="companyDetails">
              <!--  <span id="reauth-email" class="reauth-email"></span> -->
               <% Company company=(Company)request.getAttribute("companyDetails"); %>
                 <div class="form-label-group"></div>
       <div class="form-label-group"></div>
        <b>Company Id:</b><form:input  class="form-control" type="text" path="companyId"  readonly="true" />
      <b>Enter Company Name:</b><form:input  class="form-control" type="text" path="companyname"  />
      <div class="form-label-group"></div>
      <b> Enter CEO:</b><form:input  class="form-control" type="text" path="ceo" />
       <div class="form-label-group"></div>
      <b>Enter Turnover:</b><form:input class="form-control" type="text" path="turnover" />
      <div class="form-label-group"></div>
      <b>Enter Board Of Directors:</b><form:input class="form-control" type="text" path="boardOfDirectors" />
      <b>Select Sector Id</b><form:input type="text" name="sectorId" class="form-control" path="sectorid" />
      <b>Brief</b><form:input  class="form-control" type="text" path="breifwriteup" />
      <b>Stock Code</b><form:input  class="form-control" type="text" path="stock_code" />

               
               <input class="btn btn-lg btn-primary btn-block btn-signin text-uppercase" type="submit" />
           </form:form> 
       </div>
    </div>
</body>
</html>