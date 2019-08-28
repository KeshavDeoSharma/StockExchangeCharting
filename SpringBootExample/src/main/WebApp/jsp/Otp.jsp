<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

<link href="./jsp/SignUp.css" rel="stylesheet">
</head>
<body>
  <div class="container">
       <div class="card card-container">
           
  
  <ul class="nav nav-pills red">
    <li class="active"><a data-toggle="pill" href="#home">Generate Otp</a></li>
    
  </ul>
  
  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
       <header>
           <div class="login-head">
              <h1 class="login-head-content"><i class="fa fa-pencil-square-o"></i> Generate OTP</h1>
           </div>
           </header>
        <form:form class="form-signin" method="POST" action="/generateOtp" modelAttribute="GenerateOtp">
                
               <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Generate OTP</button>
           </form:form>  
    </div>
   
  </div>
       </div>
    </div> 

</body>
</html>