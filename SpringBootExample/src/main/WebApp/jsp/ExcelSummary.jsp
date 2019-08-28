<%@page import="java.text.SimpleDateFormat"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.keshav.SpringBootExample.model.ImportData"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html lang="en">
<head>

<title>Summary of Upload</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"
href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="importStockPageStyle.css" />
<script
src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link rel="shortcut icon"
href="http://www.brianshim.com/webtricks/wp-content/uploads/2012/11/stars_favicon.png"
type="image/x-icon" />
<link rel="stylesheet" type="text/css" href="./jsp/addCompanyStyle.css">

<!-- <meta charset="ISO-8859-1"> -->

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
  <img src="logo.webp">
 </div>
  <div class="col-md-8">
  <ul class="nav nav-pills nav-justified">
       <li class="dropdown"><a class="dropdown-toggle"
      data-toggle="dropdown" href="#">Import Data <span class="caret"></span></a>
      <ul class="dropdown-menu">
       <li><a href="/loadImport">Add Import</a></li>
       <li><a href="/importData">View Import</a></li>
      </ul></li>
        <li class="dropdown  active"><a class="dropdown-toggle"
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
<div class="row">
<div class="col-md-3"></div>
<div class="col-md-6">
 <div id="login-box">
<div class="card">
     <div class="card-body">
      <h3 class="card-title text-center" align="center">Summary of Upload
       </h3>
      <hr>
       <div class="form-group row">
        <label class="col-lg-5 col-form-label form-control-label">Company Name:</label>
        <div class="col-lg-7">
          <%=data.getCompanyName() %>
        </div>
       </div>
       <div class="form-group row">
        <label class="col-lg-5 col-form-label form-control-label">Stock Exchange:</label>
        <div class="col-lg-7">
           <%=data.getStockExchange() %>
        </div>
       </div>
       <div class="form-group row">
        <label class="col-lg-5 col-form-label form-control-label">Total no of records
         :</label>
        <div class="col-lg-7">
           <%=data.getRecords() %>
        </div>
       </div>
       <div class="form-group row">
        <label class="col-lg-5 col-form-label form-control-label">From Date:</label>
        <div class="col-lg-7">
           <%=sdf.format(data.getFromDate()) %>
        </div>
       </div>
       
        
       
       <div class="form-group row">
        <label class="col-lg-5 col-form-label form-control-label">To Date:</label>
        <div class="col-lg-7">

           <%=sdf.format(data.getToDate()) %>
        </div>
       </div>
            </div>
     </div>
    </div>
    </div>
    <div class="col-md-3"></div>
    </div>
    </div>
 
</div>

</body>
</html>
