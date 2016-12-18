
<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


<!-- jquery google cdn -->
<src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>


</head>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

<!-- add customer button -->
<div>
<input type="button" value="Add Customer"
onclick="window.location.href='showFormToAdd'; return false;"/>
</div>

<br/>

<div id="container">

<div id="content">


<table class="table table-striped">
  <thead>
    <tr>
    
      <th style="background-color: #e3f2fd">First Name</th>
      <th style="background-color: #e3f2fd">Last Name</th>
      <th style="background-color: #e3f2fd">Email</th>
        <th style="background-color: #e3f2fd">Action</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach  var="tempcustomers"    items="${customers}">

<!-- construct a variable  updateLink with customerId-->
<c:url var="updateLink" value="/customer/showFormToUpdate">

<c:param name="customerId" value="${tempcustomers.id}"/>

</c:url>

<!-- construct a variable  deleteLink with customerId-->
<c:url var ="deleteLink" value="/customer/delete">

<c:param name="customerId" value="${tempcustomers.id}"/>

</c:url>


<tr>
<td>${tempcustomers.firstName}</td>

<td>${tempcustomers.lastName}</td>

<td>${tempcustomers.email}</td>

<td><a href="${updateLink}">Update</a>

|

<a href="${deleteLink}" onclick="if(!(confirm('Are sure to delete this?'))) return false">Delete</a>

</td>

</tr>


</c:forEach>
    
    
  </tbody>
</table>

<!-- footer -->
<div class="footer">
<nav class="navbar navbar-default navbar-bottom" role="navigation">
  
   <center><h1>@C LokeshReddy</h1></center> 
  </div>
</nav>





</body>
</html>