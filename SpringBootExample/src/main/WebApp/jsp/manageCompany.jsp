<%@ page language="java" contentType="text/html; charset=UTF-8"
 import="java.util.*,com.keshav.SpringBootExample.model.Company"    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8">
    <title>Stock Exchange List  Page</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

<link href="./jsp/table.css" rel="stylesheet">
<script>
function editList(companyId){
	if(confirm('Do you wan to edit this company?')){
		var url='editCompany/'+companyId;
		windows.location.href=url;
	}
}
function myFunction() {
  // Declare variables 
  var input, filter, table, tr, td, i, txtValue;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");

  // Loop through all table rows, and hide those who don't match the search query
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[1];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    } 
  }
}
</script>

</head>
<body>

<%
List companyList=(List)request.getAttribute("companyList");
System.out.println(companyList);
%>
<div class="container-fluid nav-container">
<div class="row">
 <div class="col-md-2">
    <img src="logo.jpg">
 </div>
 <div class="col-md-8">
  <ul class="nav nav-pills nav-justified">
        <li class="dropdown"><a class="dropdown-toggle"
      data-toggle="dropdown" href="#">Import Data <span class="caret"></span></a>
      <ul class="dropdown-menu">
       <li><a href="/loadImport">Add Import</a></li>
      </ul></li>
        <li class="dropdown active"><a class="dropdown-toggle"
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
      <li class="dropdown"><a class="dropdown-toggle"
      data-toggle="dropdown" href="#">Manage Ipo <span class="caret"></span></a>
      <ul class="dropdown-menu">
       <li><a href="/loadIpo">Add Ipo</a></li>
       <li><a href="/listIpo">List Ipo</a></li>
      
      </ul></li>
   </ul>
 </div>
<div class="col-md-2">
   <button type="submit" class="btn btn-danger btn-md logout" onclick="location.href='Login.jsp'">Log Out</button>
 </div>
</div>
</div>
<div class="container">
 <div class="card card-container">
  <header>
   <div class="login-head">
    <h1 class="login-head-content">
     <i class="fa fa-user"></i>Manage Company
    </h1>
   </div>
  </header>
  <input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for Company names..">
  
<div class="card card-container1">
  <table>
   <thead>
    <tr>
     <th>Company Id</th>
     <th>Company Name</th>
     <th>TurnOver</th>
     <th>CEO</th>
     <th>Board of Directors</th>
      <th>Stock Code</th>
     <th>Edit</th>
      <th>Delete</th>
    </tr>
   </thead>
   <tbody id="myTable">
  <c:forEach items="${companyList}" var="list">
<tr>
<td>${list.companyId}</td>
<td>${list.companyname}</td>
<td>${list.turnover}</td>
<td>${list.ceo}</td>
<td>${list.boardofdirectors}</td>
<td>${list.stock_code}</td>
<td> 
<a href = "<c:url value ='/editCompany/${list.companyId}'/>">Edit</a></td>
<td><a href = "<c:url value ='/deactivateCompany/${list.companyId}'/>">Activate or Deactivate</a>
</td>
</tr>
</c:forEach>

  </tbody>
</body>
</html>