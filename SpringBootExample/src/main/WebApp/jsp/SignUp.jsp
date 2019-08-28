<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>SignUp Page</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">

<link href="${pageContext.request.contextPath}/jsp/SignUp.css" rel="stylesheet">
</head>
<body>
           
          
            <div class="container">
       <div class="card card-container">
           
  
  <ul class="nav nav-pills red">
    <li class="active"><a data-toggle="pill" href="#home">SignUp as Admin</a></li>
    <li><a data-toggle="pill" href="#menu1">SignUp as User</a></li>
    
  </ul>
  
  <div class="tab-content">
    <div id="home" class="tab-pane fade in active">
      <!-- -----------------Admin Signup----------------- -->
       <header>
           <div class="login-head">
              <h1 class="login-head-content"><i class="fa fa-pencil-square-o"></i>  Admin Registrations</h1>
           </div>
           </header>
        <form:form class="form-signin" method="POST" action="/addRegisterAdmin" modelAttribute="register">
               <span id="reauth-email" class="reauth-email"></span>
               <form:input type="text" id="inputUsername" class="form-control" placeholder=" Username" path="username" />
              
             <span id="reauth-email" class="reauth-email"></span>
              <form:input type="email" id="inputEmail" class="form-control" placeholder="Email" path="email" />
              <form:input type="password" id="inputPassword" class="form-control" placeholder="Password" path="password"  />
              <form:input type="password" id="inputCPassword" class="form-control" placeholder="Confirm password" path="confirmpassword"  />
               <form:input type="text" id="Contact" class="form-control" placeholder="Contact Number"  path="mobileNumber" />
               <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign Up</button>
           </form:form>  
           <a href="/loadLogin" class="signup">Already Registered? Sign in</a>
    </div>
    <div id="menu1" class="tab-pane fade">
       <header>
    <!-- -----------------User signup----------------- -->
           <div class="login-head">
              <h1 class="login-head-content"><i class="fa fa-pencil-square-o"></i>  User Registration</h1>
           </div>
           </header>
          <form:form class="form-signin" action="/addRegisterUser" method="POST" modelAttribute="register" >
               <span id="reauth-email" class="reauth-email"></span>
              <b>Username:</b> <form:input type="text" id="inputUsername" class="form-control" placeholder=" Username" path="username" required="required"/>
              
             <span id="reauth-email" class="reauth-email"></span>
             <b>Email:</b> <form:input type="email" id="inputEmail" class="form-control" placeholder="Email" path="email" required="required" />
              <form:input type="password" id="inputPassword" class="form-control" placeholder="Password" path="password" required="required"  />
              <form:input type="password" id="inputCPassword" class="form-control" placeholder="Confirm password" path="confirmpassword" required="required" />
               <form:input type="text" id="Contact" class="form-control" placeholder="Contact Number" path="mobileNumber"  required="required" />
               <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign Up</button>
           </form:form> 
           <a href="/loadLogin" class="signup">Already Registered? Sign in</a>
    </div>
   
  </div>
       </div>
    </div> 
</body>
</html>