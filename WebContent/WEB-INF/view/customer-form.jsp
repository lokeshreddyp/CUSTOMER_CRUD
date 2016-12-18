<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link type="text/css"
      rel="stylesheet"
      href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">
<title>Insert title here</title>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>




</head>
<body>


<div id="wrapper">


<div id=header>


<nav class="navbar navbar-light bg-faded" style="background-color: #7FFF00">

   <font face="Italic" style="font-size:50px;">
   Hello this page is inder construction!!!</font>
   
</nav>
</div>
</div>


<br/>

<div id="container">
<h3>Save Customer</h3> <br/>
<div id="content">

<form:form action="saveCustomer" modelAttribute="customer" method="POST">


<!-- to find id number which we have selected to update -->

<form:hidden path="id"/>


<table class="table table-striped">
  <tbody>
<tr>
<td><label>FirstName</label></td>
<td><form:input path="firstName"/></td>
</tr>
<tr>
<td><label>LastName</label></td>
<td><form:input path="lastName"/></td>
</tr>
<tr>
<td><label>Email</label></td>
<td><form:input path="email"/></td>
    </tr>
    
  </tbody>
</table>

<br/>
<center><form:button class="save">Save</form:button></center>
<br/>
<!-- to redirect to different page -->
<a href="${pageContext.request.contextPath}/customer/list">Back To List</a>
</form:form>
<nav class="navbar navbar-default navbar-bottom" role="navigation">
  <div class="container">
   <center><h1>@C LokeshReddy</h1></center> 
  </div>
</nav>







</body>
</html>